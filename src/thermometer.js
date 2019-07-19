function toFahr(celsius){
    return Math.round(celsius*9/5+32).toFixed(2);
}

function toCels(fahr){
    return ((fahr - 32) *5/9).toFixed(2);
}

show("80 is", toCels(80), "C");     //26.67 °C
show("26.67C is", toFahr(26.67), "F");   //80 °F

function show(...s){
    console.log(s);
}
