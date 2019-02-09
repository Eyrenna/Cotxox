package cotxox;

public class Carrera {
    // Atributos
    private String tarjetaCredito = "";
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor   = "";

    // Constructor
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    //Métodos
    public String getTarjetaCredito() {
        return tarjetaCredito;

    }

}
