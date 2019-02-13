package cotxox;

public class Carrera {
    // Atributos
    private int tiempoEsperadoMinutos = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor   = "";
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0;

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
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public void setTiempoEsperadoMinutos(int tiempoEsperadoMinutos) {
        this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
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

    public double getDistancia() {
        return distancia;
    }
    public double getTiempoEsperadoMinutos() {
        return tiempoEsperadoMinutos;
     }

    /*public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado();
    }*/


}
