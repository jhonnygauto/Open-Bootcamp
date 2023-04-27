package tema3;
public class SmartWatch extends SmartDevice{
    boolean controlsuenho;
    boolean controlMusica;
    boolean pronosticoTiempo;

    SmartWatch(){}

    public SmartWatch(String marca, String modelo, String numeroSerie, boolean controlsuenho, boolean controlMusica, boolean pronosticoTiempo) {
        super(marca, modelo, numeroSerie);
        this.controlsuenho = controlsuenho;
        this.controlMusica = controlMusica;
        this.pronosticoTiempo = pronosticoTiempo;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", controlsuenho=" + controlsuenho +
                ", controlMusica=" + controlMusica +
                ", pronosticoTiempo=" + pronosticoTiempo +
                '}';
    }
}
