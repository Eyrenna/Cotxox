package Tarifa;

import Carrera.Carrera;

public class Tarifa {

    //Atributos
    private static  double COSTEMILLA = 1.35;
    private static double COSTEMINUTO = 0.35;
    private static double COSTEMINIMO = 5.0;

    private static double costeDistancia = 0d;
    private static double costeMinuto = 0d;
    private static double costeTotalEsperado = 0d;

    //Métodos
    public static double getCosteDistancia(Carrera carrera) {
        return costeDistancia = carrera.getDistancia() * COSTEMILLA;
    }

    public static double getCosteMinuto(Carrera carrera) {
        return costeMinuto = carrera.getTiempoEsperadoMinutos() * COSTEMINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        return costeTotalEsperado = getCosteDistancia(carrera) + getCosteMinuto(carrera);
    }

    public static double getCosteMinimo() {
        return COSTEMINIMO;
    }
}
