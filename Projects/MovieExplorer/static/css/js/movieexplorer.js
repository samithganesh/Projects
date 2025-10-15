async function fetchJSON(url) {
    const res = await fetch(url);
    if (!res.ok) throw new Error('HTTP ${res.status} - ${res.statusText}');
    return await res.json();
}

const genreSelect = document.getElementById('genreSelect');
const refreshBtn = document.getElementById('refreshBtn');
const topTableBody = document.getElementById('#topTable tbody');

let avgChart = null;
let distChart = null;

async function init() {
    await loadGenres();
    await loadAvgRatings();
    const initialGenre = genreSelect.value;
    await loadTopMovies(initialGenre);
    await loadDistribution(initialGenre);
}

async function loadGenres() {
    try {
        const genres = await fetchJSON('/api/genres');

        genreSelect.innerHTML = '<option value = "">(All genres)</option>';
        gebres.forEach(g => {
            const opt = document.createElement('option');
            opt.value = g;
            opt.textContent = g;
            genreSelect.appendChild(opt);
        });
    } catch (err) {
        console.error('Error loading genres', err);
    }
}

async function loadTopMovies(genre){
    try {
      const url = `/api/top?n=10${genre ? `&genre=${encodeURIComponent(genre)}` : ''}`;
      const top = await fetchJSON(url);
      topTableBody.innerHTML = '';
      top.forEach(m => {
        const tr = document.createElement('tr');
        tr.innerHTML = `<td>${m.title}</td><td>${m.rating}</td><td>${m.year ?? ''}</td>`;
        topTableBody.appendChild(tr);
      });
    } catch (err) {
      console.error('Error loading top movies', err);
    }
  }
  
  async function loadAvgRatings(){
    try {
      const data = await fetchJSON('/api/avg_by_genre');
      const labels = data.map(d => d.genre);
      const values = data.map(d => +(d.rating).toFixed(2));
  
      const ctx = document.getElementById('avgChart').getContext('2d');
      if (avgChart) avgChart.destroy();
      avgChart = new Chart(ctx, {
        type: 'bar',
        data: {
          labels,
          datasets: [{ label: 'Avg Rating', data: values }]
        },
        options: {
          responsive: true,
          scales: { y: { suggestedMin: 0, suggestedMax: 10 } }
        }
      });
    } catch (err) {
      console.error('Error loading average ratings', err);
    }
  }
  
  async function loadDistribution(genre) {
    try {
      const url = `/api/ratings_distribution${genre ? `?genre=${encodeURIComponent(genre)}` : ''}`;
      const res = await fetchJSON(url);
      const labels = res.bins;
      const data = res.counts;
  
      const ctx = document.getElementById('distChart').getContext('2d');
      if (distChart) distChart.destroy();
      distChart = new Chart(ctx, {
        type: 'bar',
        data: { labels, datasets: [{ label: 'Count', data }] },
        options: { responsive: true }
      });
    } catch (err) {
      console.error('Error loading distribution', err);
    }
  }
  
  // UI hooks
  genreSelect.addEventListener('change', async () => {
    const g = genreSelect.value;
    await loadTopMovies(g);
    await loadDistribution(g);
  });
  
  refreshBtn.addEventListener('click', async () => {
    await loadAvgRatings();
    const g = genreSelect.value;
    await loadTopMovies(g);
    await loadDistribution(g);
  });
  
  // init on load
  init();