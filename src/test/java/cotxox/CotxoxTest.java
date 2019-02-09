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
    public void getTarjetaCreditoTest() {
        Carrera tarjetaUser = new Carrera("1234");
        assertEquals("1234", tarjetaUser.getTarjetaCredito());
    }
}
