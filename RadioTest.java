/* Christian Daniel Perez De Leon (19710)
 * Pablo Reyna (19822)
 * Fecha de creacion: 18/01/2020
 * Ultima edicion: 22/01/2020
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class RadioTest {

	miRadio radio = new miRadio();
	
	
	@Test
	public void testEstacion() {
		String val1 = radio.estacionActual();
		String val2 = "530";
		assertEquals(val1, val2);
	}
	
	@Test
	public void testEncendido() {
		boolean val1 = radio.estado();
		boolean val2 = false;
		assertEquals(val1,val2);
	}
	
	@Test
	public void testApagado() {
		radio.onOff();
		boolean val1 = radio.estado();
		boolean val2 = true;
		assertEquals(val1,val2);
	}

}
