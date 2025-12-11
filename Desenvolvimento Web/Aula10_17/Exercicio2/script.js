const cores = ["red", "green", "blue", "yellow", "purple", "orange", "pink", "cyan", "magenta", "brown"];
const retangulos = document.querySelectorAll(".retangulo");

let indiceAtual = 0;

function mudarCores() {
    retangulos.forEach(retangulo => {
        retangulo.style.backgroundColor = cores[indiceAtual];
        indiceAtual = (indiceAtual + 1) % cores.length;
    });
}

setInterval(mudarCores, 500); 