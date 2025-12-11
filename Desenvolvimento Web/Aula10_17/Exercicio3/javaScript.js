window.onload = init;

function init(){
    var el = document.getElementById('lista')

    el.addEventListener('mouseover', function(e){
        mudaCorDeFundo(e.target.id);
    });
}

function mudaCorDeFundo(cor){
    document.body.style.backgroundColor=cor;
}