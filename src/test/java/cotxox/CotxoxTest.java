package cotxox;

import static org.junit.Assert.assertEquals;

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
    }

    @Test
    public void getTest() {
        assertEquals("4916119711304546", servicio.getTarjetaCredito());
        assertEquals("Aeroport Son Sant Joan", servicio.getOrigen());
        assertEquals("Magaluf", servicio.getDestino());
        assertEquals(7.75, servicio.getDistancia(), 0.0);
        assertEquals(10.4625, Tarifa.getCosteDistancia(servicio), 0.0);
        assertEquals(3.5, Tarifa.getCosteMinuto(servicio), 0.0);
        assertEquals(13.9625, Tarifa.getCosteTotalEsperado(), 0.0);
        assertEquals(13.9625, servicio.getCosteEsperado(), 0.0);
    }
}
