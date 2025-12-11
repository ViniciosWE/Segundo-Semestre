const retangulos = document.querySelectorAll('.retangulo');

function random(number) {
  return Math.floor(Math.random() * (number + 1));
}

function alterarCor() {
  retangulos.forEach(function(retangulo) {
    var rndCol =
      "rgb(" + random(255) + "," + random(255) + "," + random(255) + ")";
    retangulo.style.backgroundColor = rndCol;
  });

  setTimeout(alterarCor, 1000);
}

alterarCor();