package com.precioiva;
public class PrecioIva {
    public static void main(String[] args) {
        double montoTotalIva = calcularPrecioIva(50000, 10);
        System.out.println("El monto total con IVA es = " + (int)montoTotalIva);

    }

    static double calcularPrecioIva(double precio, double porcentajeIva){
        double aux = (porcentajeIva / 100) + 1;
        return precio * aux;
    }
}
