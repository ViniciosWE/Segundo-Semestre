$(document).ready(function () {
  // Imagem padrão
  var imagemPadrao = "./imagens/card-ciclope.png";

  // Opções de imagem para o personagem
  var opcoesImagem = {
    ciclope: "./imagens/card-ciclope.png",
    'jean-grey': "./imagens/card-jean-grey.png",
    'lince-negra': "./imagens/card-lince-negra.png",
    tempestade: "./imagens/card-tempestade.png",
    vampira: "./imagens/card-vampira.png",
    wolverine: "./imagens/card-wolverine.png",
    noturno: "./imagens/card-noturno.png",
    magneto: "./imagens/card-magneto.png",
  };

  // Textos associados a cada imagem
  var textosImagem = {
    ciclope: {
      texto1: "CICLOPE",
      texto2: "Ele tem o poder de disparar rajadas ópticas por um acidente que aconteceu com ele quando criança, mas não consegue controlá-los"
    },
    'jean-grey': {
      texto1: "JEAN GREY",
      texto2: "Jean Grey é uma mutante nível ômega e o principal avatar da Força Fênix, no qual manifesta poderes cósmicos. A telepatia e telecinese"
    },
    'lince-negra': {
      texto1: "LINCE NEGRA",
      texto2: "Ela tem o poder de atravessar matéria sólida, campos de energia, rajadas ópticas, continuando intacta, e também tem o poder de andar no ar"
    },
    tempestade: {
      texto1: "TEMPESTADE",
      texto2: "Tem o poder de controlar as forças da natureza, muito poderosa ela pode produzir raios, chuvas, gelos, ventos, neblina, entre outros efeitos"
    },
    vampira: {
      texto1: "VAMPIRA",
      texto2: "Ela tem o poder de absorver a vitalidade e memória das pessoas que toca ou, no caso dos mutantes, os poderes e a memória, mas só temporariamente"
    },
    wolverine: {
      texto1: "WOLVERINE",
      texto2: "Poderes. Garras Metálicas. Fator de Cura Regenerativo, Super Agilidade."
    },
    noturno: {
      texto1: "NOTURNO",
      texto2: "Ele é um mutante que nasceu com cauda, orelhas pontudas e com o poder de se Teletransportar"
    },
    magneto: {
      texto1: "MAGNETO",
      texto2: "Ele tem o poder de magnetocinese, ou seja, controlar objetos de metal e criar campos magnéticos"
    },
  };

  // Selecionar o Ciclope como inicialmente destacado
  var ultimaImagemSelecionada = $("#ciclope");
  ultimaImagemSelecionada.css({
    "border-top": "6px solid aqua",
    "border-bottom": "6px solid aqua",
    "border-left": "6px solid aqua",
    "border-right": "6px solid aqua",
  });

  // Definir imagem e textos padrão inicial
  $("#personagem").attr("src", imagemPadrao);
  $("#texto1").text(textosImagem.ciclope.texto1);
  $("#texto2").text(textosImagem.ciclope.texto2);

  // Adicionar evento de mouseover a cada imagem
  $(".tamanho").mouseover(function () {
    // Remover bordas da última imagem selecionada
    ultimaImagemSelecionada.css({
      "border-top": "none",
      "border-bottom": "6px solid aqua",
      "border-left": "none",
      "border-right": "none",
    });

    // Adicionar borda a toda a imagem ao passar o mouse
    $(this).css({
      "border-top": "6px solid aqua",
      "border-bottom": "6px solid aqua",
      "border-left": "6px solid aqua",
      "border-right": "6px solid aqua",
    });

    // Atualizar a última imagem selecionada
    ultimaImagemSelecionada = $(this);

    // Obter o ID da imagem
    var novaImagemId = $(this).attr("id");

    // Atualizar a imagem, texto1 e texto2 com base nos dados associados à imagem
    $("#personagem").attr("src", opcoesImagem[novaImagemId] || imagemPadrao);
    $("#texto1").text(textosImagem[novaImagemId].texto1);
    $("#texto2").text(textosImagem[novaImagemId].texto2);
  });

  //Painel Linha do tempo
  $("#flip1").click(function () {
    $("#panel1").slideToggle("slow");
  });
  $("#flip2").click(function () {
    $("#panel2").slideToggle("slow");
  });
  $("#flip3").click(function () {
    $("#panel3").slideToggle("slow");
  });
  $("#flip4").click(function () {
    $("#panel4").slideToggle("slow");
  });
  $("#flip5").click(function () {
    $("#panel5").slideToggle("slow");
  });
  $("#flip6").click(function () {
    $("#panel6").slideToggle("slow");
  });
  $("#flip7").click(function () {
    $("#panel7").slideToggle("slow");
  });
  $("#flip8").click(function () {
    $("#panel8").slideToggle("slow");
  });
  $("#flip9").click(function () {
    $("#panel9").slideToggle("slow");
  });
  $("#flip10").click(function () {
    $("#panel10").slideToggle("slow");
  });
});
