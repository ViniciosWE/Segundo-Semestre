$(document).ready(init);

function init() {
    $("#t1").css("background-color", "blue");
    $("#t2").addClass("vermelho");

    /*$("#b").click(function(){
        $("#t2").removeClass("vermelho");
    });
    $("#b2").click(function(){
        $("#t2").addClass("vermelho");
    });
    */
   
    $("#b3").click(function(){
        $("#t2").toggleClass("vermelho");
    });
}