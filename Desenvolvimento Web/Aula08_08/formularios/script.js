window.onload = init;

function init(){
    var enviar = document.getElementById("enviar");
    enviar.addEventListener("click", enviando, false);

    function enviando(event){
        var nome = document.getElementById("nome").value;
        var email = document.getElementById("email").value;
        var msg = document.getElementById("msg").value;

        var resultado = "<p>Nome: " + nome + "</p><p>Email: " + email + "</p><p>Mensagem: " + msg + "</p>";
        var saida = document.getElementById("saida");
        saida.innerHTML = resultado;
        saida.style.display = "block";
        event.preventDefault();
    }
}

