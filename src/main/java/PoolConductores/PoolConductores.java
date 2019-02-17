package PoolConductores;

import Conductor.Conductor;

import java.util.ArrayList;
import java.util.Random;

public class PoolConductores {
    //Atributos
    private ArrayList<Conductor> poolConductores = new ArrayList<>();

    //Constructor
    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    //Métodos
    public ArrayList<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor() {
        Random random = new Random();
        Conductor conductor = new Conductor();
        boolean ocupado = false;
        while (!ocupado) {
            int posicion = random.nextInt(poolConductores.size());
            conductor = getPoolConductores().get(posicion);
            if (!conductor.isOcupado()) {
                ocupado = true;
                conductor.setOcupado(ocupado);

            }
            else {
                continue;
            }
        }
        return conductor;
    }
}
