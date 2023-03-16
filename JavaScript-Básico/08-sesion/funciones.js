function verdadero(){
    return true;
}
console.log(verdadero());

function funcionAsincrona(time){
    return new Promise(resolve => setTimeout(resolve, time))
}
funcionAsincrona(5000)
    .then(() => console.log("Hola soy una promesa!!!"))

function* generadora(){
    let indice = 0;
    while(true){
        indice += 2;
        yield indice;
    }
}

const gen = generadora();
console.log(gen.next());
console.log(gen.next());
console.log(gen.next());