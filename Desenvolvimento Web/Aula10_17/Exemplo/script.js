window.onload = main;
function main() {
    document.getElementById("lampada").onmouseover = acender;
    document.getElementById("lampada").onmouseout = apagar;
    document.getElementById("lampada").onclick = quebrar;
}

function acender(){
    trocarImagem('lamp_on.gif');

}
function apagar(){
    trocarImagem('lamp_off.gif');
}
function quebrar(){
    trocarImagem('quebrada.jpg');
}
function trocarImagem(imagem){
    document.getElementById("lampada").src="imagens/"+imagem;
}