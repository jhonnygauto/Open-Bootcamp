public class Main {
    public static void main(String[] args) {
        int numeroIf = -9;

        if (numeroIf > 0){
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        //--------------
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //--------------
        int numeroDoWHile = 0;

        do {
            numeroDoWHile = numeroDoWHile + 1;
            System.out.println(numeroDoWHile);
        } while (numeroDoWHile < 1);

        //--------------
        for (int numeroFor = 0;numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }

        //--------------
        String estacion = "INVIERNO";

        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}