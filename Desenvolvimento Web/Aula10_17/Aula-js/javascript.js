window.onload = principal;


function principal(){
    //var botao = document.querySelector("button");
    //var botao = document.getElementById("b1");
    var botao = document.querySelector("#b1");
    //botao.onclick = mudaCordDeFundo;
    //botao.ondblclick = mudaCordDeFundo;
    botao.onmouseover = mudaCordDeFundo;
    botao.onmouseout = voltarCor;
    //botao.onmouseleave = voltarCor;
}

function mudaCordDeFundo(){
    document.body.style.backgroundColor = "red";
    var botao = document.querySelector("#b1");
    botao.innerHTML = "O mouse está sobre o BOTÃO";
}
function voltarCor(){
    document.body.style.backgroundColor = "white";
    var botao = document.querySelector("#b1");
    botao.innerHTML = "BOTÃO";
}