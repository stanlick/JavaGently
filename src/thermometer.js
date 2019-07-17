function toFahr(celsius){
    return Math.round(celsius*9/5+32).toFixed(2);
}

function toCels(fahr){
    return ((fahr - 32) *5/9).toFixed(2);
}

console.log("80F is", toCels(80), "C");     //26.67 °C
console.log("26.67 is", toFahr(26.67), "F");   //80 °F