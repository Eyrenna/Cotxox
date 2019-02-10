package cotxox;

public class Carrera {
    // Atributos
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor   = "";
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";

    // Constructor
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    //Setes
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    //Métodos

    //Getes
    public String getTarjetaCredito() {
        return tarjetaCredito;

    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }


}
