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
    }

    @Test
    public void getTest() {
        assertEquals("4916119711304546", servicio.getTarjetaCredito());
        assertEquals("Aeroport Son Sant Joan", servicio.getOrigen());
    }
}
