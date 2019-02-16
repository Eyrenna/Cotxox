package Cotxox;

import static org.junit.Assert.assertEquals;

import Carrera.Carrera;
import Tarifa.Tarifa;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CotxoxTest
{
    /**
     * Rigorous Test :-)
     */
    private Carrera servicio = null;
    private Carrera servMin = null;

    @Before
    public void init() {
        String tarjetaCredito = "4916119711304546";
        String origen = "Aeroport Son Sant Joan";
        String destino = "Magaluf";
        double distancia = 7.75;
        int tiempoEsperadoMinutos = 10;

        servicio = new Carrera(tarjetaCredito);
        servicio.setOrigen(origen);
        servicio.setDestino(destino);
        servicio.setDistancia(distancia);
        servicio.setTiempoEsperadoMinutos(tiempoEsperadoMinutos);


        double distanciaMinima = 1.2;
        int tiempoEsperadoMinMinimo = 1;

        servMin = new Carrera(tarjetaCredito);
        servMin.setDistancia(distanciaMinima);
        servMin.setTiempoEsperadoMinutos(tiempoEsperadoMinMinimo);

        double propina = 2.25;

        servicio.setPropina(propina);

    }

    @Test
    public void getTest() {
        assertEquals("4916119711304546", servicio.getTarjetaCredito());
        assertEquals("Aeroport Son Sant Joan", servicio.getOrigen());
        assertEquals("Magaluf", servicio.getDestino());
        assertEquals(7.75, servicio.getDistancia(), 0.0);
        assertEquals(10.4625, Tarifa.getCosteDistancia(servicio), 0.0);
        assertEquals(3.5, Tarifa.getCosteMinuto(servicio), 0.0);
        assertEquals(13.9625, Tarifa.getCosteTotalEsperado(servicio), 0.0);
        assertEquals(13.9625, servicio.getCosteEsperado(), 0.0);
    }

    @Test
    public void logicaTest() {
        assertEquals(13.9625, servicio.getCosteEsperado(), 0.0);
        assertEquals(5.0, servMin.getCosteEsperado(), 0.0);
    }

    @Test
    public void pagoTest() {
        assertEquals(13.9625, servicio.getCosteTotal(), 0.0);
        assertEquals(5.0, servMin.getCosteTotal(), 0.0);
    }

    @Test
    public void recibirPropina() {
        assertEquals(2.25, servicio.getPropina(), 0.0);
    }
}
