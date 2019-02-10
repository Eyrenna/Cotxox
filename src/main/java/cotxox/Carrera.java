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
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    //Setes
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    //Métodos

    //Getes
    public String getTarjetaCredito() {
        return tarjetaCredito;

    }

    public String getOrigen() {
        return origen;
    }


}
