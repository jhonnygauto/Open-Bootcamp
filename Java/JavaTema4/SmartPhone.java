package tema3;
public class SmartPhone extends SmartDevice{
    int memoriaRam;
    int almacenamiento;
    boolean tarjetaSd;

    SmartPhone(){}

    public SmartPhone(String marca, String modelo, String numeroSerie, int memoriaRam, int almacenamiento, boolean tarjetaSd) {
        super(marca, modelo, numeroSerie);
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.tarjetaSd = tarjetaSd;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", almacenamiento=" + almacenamiento +
                ", tarjetaSd=" + tarjetaSd +
                '}';
    }
}
