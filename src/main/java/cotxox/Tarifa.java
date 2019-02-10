package cotxox;

public class Tarifa {

    //Atributos
    private static  double COSTEMILLA = 1.35;
    private static double COSTEMINUTO = 0.35;
    private int COSTEMINIMO = 5;
    private static double costeDistancia = 0;
    private static double costeMinuto = 0;

    //Métodos
    public static double getCosteDistancia(Carrera carrera) {
        return costeDistancia = carrera.getDistancia() * COSTEMILLA;
    }

    public static double getCosteMinuto(Carrera carrera) {
        return costeMinuto = carrera.getTiempoEsperadoMinutos() * COSTEMINUTO;
    }
}
