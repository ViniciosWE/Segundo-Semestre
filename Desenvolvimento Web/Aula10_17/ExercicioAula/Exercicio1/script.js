window.onload = main;

function main() {
    //setInterval("alert('oi....')", 1000);
    //setTimeout("alert('oi....')", 2000);
    document.querySelector("#botao").onclick = mudarCores;
    document.querySelector("#botao").onmouseover = passarMouse;
    document.querySelector("#botao").onmouseout = tiraMouse;

}
function nomeCor(corBack, corText) {
    document.body.style.backgroundColor = corBack;
    document.body.style.color = corText;
}
function passarMouse() {
    document.querySelector("#texto").innerHTML = "Clique aqui para mudar a cor"
}
function tiraMouse() {
    document.querySelector("#texto").innerHTML = "Texto de ajuda aqui."
}
function mudarCores(){
    var cor1 = window.prompt("Cor do BackGrond:");
    var cor2 = window.prompt("Cor do Texto:");
    nomeCor(cor1, cor2);
}

