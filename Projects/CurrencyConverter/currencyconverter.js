const fromCurrency  = document.getElementById("fromCurrency");
const toCurrency = document.getElementById("toCurrency");
const amountInput = document.getElementById("amount");
const resultDiv = document.getElementById("result");
const lastUpdated = document.getElementById("lastUpdated");
const convertBtn = document.getElementById("convertBtn");

const API_KEY = "592485e03c457720e7ce1ffb";
const API_URL = `https://v6.exchangerate-api.com/v6/${API_KEY}/latest/`;

async function loadCurrencies() {
    const res = await fetch(API_URL + "USD");
    const data = await res.json();
    const currencies = Object.keys(data.conversion_rates);

    currencies.forEach(curr => {
        let option1 = document.createElement("option");
        let option2 = document.createElement("option");

        option1.value = option2.value = curr;
        option1.textContent = option2.textContent = curr;

        fromCurrency.appendChild(option1);
        toCurrency.appendChild(option2);
    });
    fromCurrency.value = "USD";
    toCurrency.value = "EUR";
}

async function convertCurrency() {
    const from = fromCurrency.value;
    const to = toCurrency.value;
    const amount = parseFloat(amountInput.value);

    if (isNaN(amount) || amount <= 0) {
        resultDiv.textContent = "Please enter a valid amount!";
        return;
    }

    const res = await fetch(API_URL + from);
    const data = await res.json();
    const rate = data.conversion_rates[to];

    const converted = (amount * rate).toFixed(2);
    resultDiv.textContent = `${amount} ${from} = ${converted} ${to}`;
    lastUpdated.textContent = `Last updated: ${data.time_last_update_utc}`;
}

convertBtn.addEventListener("click", convertCurrency);

loadCurrencies();