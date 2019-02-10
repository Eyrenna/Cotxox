package cotxox;

public class Carrera {
    // Atributos
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor   = "";
    private String tarjetaCredito = "";
    private String origen = "";

    // Constructor
    public Carrera(String tarjetaCredito, String origen) {
        this.tarjetaCredito = tarjetaCredito;
        this.origen = origen;
    }

    //Métodos
    public String getTarjetaCredito() {
        return tarjetaCredito;

    }

    public String getOrigen() {
        return origen;
    }

}
