package com.ejemplo;
public class ConcatenarNombres {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Lucas", "Patricia", "Antonio", "Mirna"};
        String imprimirNombres = "";

        for (String nombre:nombres) {
//            imprimirNombres = imprimirNombres + nombre + " ";
            imprimirNombres = imprimirNombres.concat(nombre) + " ";
        }

        System.out.println(imprimirNombres);
    }
}
