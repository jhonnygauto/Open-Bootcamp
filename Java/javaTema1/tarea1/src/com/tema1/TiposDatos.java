package com.tema1;
public class TiposDatos {
    public static void main(String[] args) {
        //1.Númericos
        //1.1.Enteros
        byte variable1 = 1;
        System.out.println("Byte: " + variable1);
        short variable2 = 5;
        System.out.println("Short: " + variable2);
        int variable3 = 10;
        System.out.println("Int: " + variable3);
        long variable4 = 100;
        System.out.println("Long: " + variable4 + "\n");

        //1.2.Decimales
        float variable5 = 3.45f;
        System.out.println("Float: " + variable5);
        double variable6 = 125.765d;
        System.out.println("Double: " + variable6 + "\n");

        //2.Booleanos
        boolean variable7 = true;
        System.out.println("Verdadero: " + variable7);
        boolean variable8 = false;
        System.out.println("Falso: " + variable8 + "\n");

        //3.Caracteres
        char variable9 = 'y';
        System.out.println("Char: " + variable9);
        String variable10 = "Hola Mundo";
        System.out.println("String: " + variable10);
    }
}
