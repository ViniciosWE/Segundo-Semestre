const quadrado = document.getElementById("retangulo");

function random(number) {
  return Math.floor(Math.random() * (number + 1));
}

function alterarCor() {
  var rndCol =
    "rgb(" + random(255) + "," + random(255) + "," + random(255) + ")";
  quadrado.style.backgroundColor = rndCol;

  setTimeout(alterarCor, 1000);
}

alterarCor();
