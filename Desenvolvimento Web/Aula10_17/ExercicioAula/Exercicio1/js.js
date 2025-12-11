window.onload = main;

function main(){

    document.querySelector("#botao").addEventListener('click', alertar);
    document.querySelector("#botao").addEventListener('click', mudaCores);

    document.querySelector("#botao").addEventListener('mouseover', function(e){
       alert(e.target.id);
    });

    document.querySelector("#lista").style.width = "30px";
    document.querySelector("#lista").style.backgroundColor = "yellow";
    document.querySelector("#lista").addEventListener('mouseover', function(e){
        alert(e.target.innerHTML);
    });
}

function alertar(){
    alert("oi");
}

function mudaCores(){
    document.body.style.backgroundColor = "pink";
    document.body.style.color = "red";
}