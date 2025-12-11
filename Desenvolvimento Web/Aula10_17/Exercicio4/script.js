window.onload = principal;

var valorAdivinhar;
var tentativas = 0;
var maxTentativas = 7;

function principal() {
    valorAdivinhar = gerarValor();
    var form = document.querySelector("form");
    form.addEventListener("submit", function (event) {
        event.preventDefault();
        verificarAdivinhacao();
    });
}

function gerarValor() {
    return Math.floor(Math.random() * 100) + 1;
}

function verificarAdivinhacao() {
    var inputElement = document.getElementById("guess");
    var guess = parseInt(inputElement.value);

    if (isNaN(guess) || guess < 1 || guess > 100) {
        alert("Digite um valor válido entre 1 e 100.");
        return;
    }

    tentativas++;

    if (guess === valorAdivinhar) {
        var resultadoElement = document.getElementById("resultado");
        resultadoElement.innerHTML = "Parabéns! Você acertou o número em " + tentativas + " tentativas!";
        resultadoElement.style.color = "green";
        document.querySelector("form").style.display = "none";
    } else if (tentativas >= maxTentativas) {
        var resultadoElement = document.getElementById("resultado");
        resultadoElement.innerHTML = "Você perdeu! Suas tentativas acabaram. O número era " + valorAdivinhar + ".";
        resultadoElement.style.color = "red";
        document.querySelector("form").style.display = "none";
    } else if (guess < valorAdivinhar) {
        document.getElementById("resultado").innerHTML = "Tente um valor mais alto!";
    } else if (guess > valorAdivinhar) {
        document.getElementById("resultado").innerHTML = "Tente um valor mais baixo!";
    }

    document.getElementById("tentativas").textContent = tentativas;
    inputElement.value = "";
}
