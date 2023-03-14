const fechaHoy = new Date();
console.log(fechaHoy);

const fechaNacimiento = new Date(1992, 03, 02);
console.log(fechaNacimiento);

const variable = fechaHoy > fechaNacimiento;
console.log(variable);

const dia = fechaNacimiento.getDate();
console.log(dia);

const mes = fechaNacimiento.getMonth() + 1;
console.log(mes);

const anyo = fechaNacimiento.getFullYear();
console.log(anyo);