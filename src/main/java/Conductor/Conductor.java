package Conductor;

import java.util.ArrayList;
import java.util.List;

public class Conductor {

    //Atributos
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0d;
    private double nuevaValoracion = 0d;
    private int numValoraciones = 0;
    private double valoracion = 4;
    private boolean ocupado = false;

    //Constructor
    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public Conductor() {

    }

    //SETS
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;

    }

    public void setOcupado (boolean ocupado) {
        this.ocupado = ocupado;
    }

    //Métodos

    //GETS

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValoracion() {
        return valoracion;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
