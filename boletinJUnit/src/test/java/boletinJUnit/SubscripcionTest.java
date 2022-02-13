package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import static org.hamcrest.Matchers.*;

public class SubscripcionTest extends CoreMatchers{
	@Test
	public void testprecioPorMes() {
		double esperado = 100;
		Subscripcion s = new Subscripcion(200, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes2() {
		double esperado = 67.66666666666667;
		Subscripcion s = new Subscripcion(200, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes3() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(0, 1);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes4() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(1, 0);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes5() {
		Subscripcion a = new Subscripcion(1, 2);
		a.cancel();
		assertTrue(true);
	}
}
