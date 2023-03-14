const objeto = {
    nombre: "Jhonny",
    apellido: "Gauto",
    edad: 30,
    altura: 168,
    eresDesarrollador: true
}

const age = objeto.edad;
console.log(age);

const lista = [
    {
        ...objeto
    },
    {
        nombre: "Pedro",
        apellido: "Pérez",
        edad: 29,
        altura: 170,
        eresDesarrollador: false
    },
    {
        nombre: "Antonio",
        apellido: "Armoa",
        edad: 32,
        altura: 175,
        eresDesarrollador: false
    }
];
console.log(lista);

const listaOrdenada = lista.sort((a, b) => b.edad - a.edad);
console.log(listaOrdenada);