function validaIdMulta(idMulta){

    if(idMulta.includes("0") || idMulta.includes("1") || idMulta.includes("2") || idMulta.includes("3") || idMulta.includes("4") || idMulta.includes("5") || idMulta.includes("6") || idMulta.includes("7") || idMulta.includes("8") || idMulta.includes("9")){
        return;
    }else{
        alert("Por favor, Digite apenas Numeros ou Numeros separados com virgula");
        return;
    }

}