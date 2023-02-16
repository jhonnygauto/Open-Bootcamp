let nombre = "Jhonny";
let apellido = "Gauto";

let estudiante = nombre.concat(" ", apellido);
console.log(estudiante);

let estudianteMayus = estudiante.toUpperCase();
console.log(estudianteMayus);

let estudianteMinus = estudiante.toLowerCase();
console.log(estudianteMinus);

let numeroLetras = estudiante.length;
console.log(numeroLetras);

let primeraLetra = nombre.charAt(0);
console.log(primeraLetra);

let ultimaLetra = apellido.charAt(apellido.length - 1);
console.log(ultimaLetra)

let eliminarEspacios = estudiante.replace(/ /g, "")
console.log(eliminarEspacios);

let contieneNombre = estudiante.includes("Jhonny");
console.log(contieneNombre);