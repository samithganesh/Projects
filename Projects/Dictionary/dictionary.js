document.getElementById("searchBtn").addEventListener("click", () => {
    const word = document.getElementById("wordInput").value.trim();
    const resultDiv = document.getElementById("result");
    const errorDiv = document.getElementById("error");

    if (word === "") {
        errorDiv.textContent = "PLease enter a word: ";
        resultDiv.classList.add("hidden");
        return;
    }

    fetch(`https://api.dictionaryapi.dev/api/v2/entries/en/${word}`)
    .then(response => {
        if (!response.ok) {
            throw new Error("Word not found!");
        }
        return response.json();
    })
    .then(data => {
        const meaning = data[0].meanings[0];
        const definition = meaning.definitions[0];

        document.getElementById("word").textContent = data[0].word;
        document.getElementById("partOfSpeech").textContent = meaning.partOfSpeech;
        document.getElementById("definition").textContent = definition.definition;
        document.getElementById("example").textContent = definition.example || "N/A";

        errorDiv.textContent = "";
        resultDiv.classList.remove("hidden");
    })
    .catch(error => {
        errorDiv.textContent = error.message;
        resultDiv.classList.add("hidden");
    });
})