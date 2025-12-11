window.onload = principal;

var cadeiras;

function principal() {
    cadeiras = document.querySelectorAll(".cor");

    for (var i = 0; i < cadeiras.length; i++) {
        cadeiras[i].addEventListener('click', mudarCor);
    }
}

function mudarCor() {
    var corAtual = this.style.backgroundColor;
    
    if (corAtual === "gray") {
        this.style.backgroundColor = "blue";
    } else {
        this.style.backgroundColor = "gray";
    }
}
