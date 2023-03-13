const listaCompras = ["pan", "leche", "harina", "arroz", "fideo"];
console.log(listaCompras);

listaCompras.push("Aceite de Girasol");
console.log(listaCompras);

listaCompras.pop();
console.log(listaCompras);

const listaPeliculas = [
    {titulo: "Avatar", director: "James Cameron", fecha: new Date('December 17, 2009')},
    {titulo: "Avengers: Endgame", director: "Anthony y Joe Russo", fecha: new Date('April 26, 2019')},
    {titulo: "Titanic", director: "James Cameron", fecha: new Date('December 19, 1997')}
];

const lista = listaPeliculas.filter(obj => obj.fecha > new Date(2010, 1, 1));
console.log(lista);

// const lista2 = listaPeliculas.map((obj, indice) => `${indice + 1}- ${obj.director}`);
const listaDirectores = listaPeliculas.map(obj => `${obj.director}`);
console.log(listaDirectores);

const listaTitulos = listaPeliculas.map(obj => `${obj.titulo}`);
console.log(listaTitulos);

const listaConcat = listaDirectores.concat(listaTitulos);
console.log(listaConcat);

const listaFactPro = [...listaDirectores, ...listaTitulos];
console.log(listaFactPro);