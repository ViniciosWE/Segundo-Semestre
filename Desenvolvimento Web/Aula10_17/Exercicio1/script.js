const quadrado = document.getElementById("retangulo");
const cores = ["red", "green", "blue", "yellow", "purple", "orange"];
let indiceAtual = 0;

function alterarCor() {
    quadrado.style.backgroundColor = cores[indiceAtual];
    indiceAtual = (indiceAtual + 1) % cores.length;

    setTimeout(alterarCor, 1000);
}

alterarCor();