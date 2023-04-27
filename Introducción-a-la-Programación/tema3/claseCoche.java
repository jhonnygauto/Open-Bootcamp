public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.nroPuertas);
    }
}

class Coche{
    public int nroPuertas = 2;
    public void agregarPuerta(){
        this.nroPuertas++;
    }
}