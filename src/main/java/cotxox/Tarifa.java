package cotxox;

public class Tarifa {

    //Atributos
    private static double COSTEMILLA = 1.35;
    private double COSTEMINUTO = 0.35;
    private int COSTEMINIMO = 5;
    private static double costeDistancia;

    //Métodos
    public static double getCosteDistancia(Carrera carrera) {
        return costeDistancia = carrera.getDistancia() * COSTEMILLA;
    }
}
