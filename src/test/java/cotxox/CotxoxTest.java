package cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CotxoxTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getTest() {
        Carrera servicio = new Carrera("1234", "Mi casa");
        assertEquals("1234", servicio.getTarjetaCredito());
        assertEquals("Mi casa", servicio.getOrigen());
    }

    /*public void getOrigen () {
        Carrera origenUser = new Carrera ("Mi casa")
    }*/
}
