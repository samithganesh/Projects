const api_key = "7857a88e7f21cc8e39b5d039c2373438";

document.getElementById("searchBtn").addEventListener("click", () => {
    const city = document.getElementById("cityInput").value.trim();
    if (city) {
        getWeather(city);
    }
})

async function getWeather(city) {
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${api_key}&units=metric`;

    try {
        const response  = await fetch(url);
        if(!response.ok) throw new Error("City not found!");

        const data = await response.json()

        document.getElementById("cityName").textContent = data.name;
        document.getElementById("description").textContent = capitalizeFirstLetter(data.weather[0].description);
        document.getElementById("temperature").textContent = `Temp: ${data.main.temp} °C`;
        document.getElementById("humidity").textContent = `Humidity: ${data.main.humidity}%`;

        document.getElementById("weatherInfo").classList.remove("hidden");
        document.getElementById("error").textContent = error.message;

    }   catch (error) {
        document.getElementById("weatherInfo").classList.add("hidden");
        document.getElementById("error").textContent = error.message;
    }

    function capitalizeFirstLetter(str) {
        return str.charAt(0).toUpperCase() + str.slice(1);
    }

    const weatherMain = data.weather[0].main;
    updateBackground(weatherMain);
}   


function updateBackground(weatherMain) {
    const body = document.body;

    body.className = "";

    switch (weatherMain) {
        case "Clear":
            body.classList.add("clear-bg");
            break;
        case "Clouds":
            body.classList.add("clouds-bg");
            break;
        case "Rain":
        case "Drizzle":
        case "Mist":
            body.classList.add("rain-bg");
            break;
        case "Thunderstorm":
            body.classList.add("thunder-bg");
            break;
        case "Snow":
            body.classList.add("snow-bg");
            break;
        default:
            body.classList.add("default-bg");
            break;
    }
}
