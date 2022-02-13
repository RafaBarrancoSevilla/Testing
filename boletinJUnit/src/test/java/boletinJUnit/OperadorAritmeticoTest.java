package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import static org.hamcrest.Matchers.*;

public class OperadorAritmeticoTest extends CoreMatchers{
	
	@Test
	public void suma() {
		int esperado = 8;
		int a = 5;
		int b = 3;
		int suma = OperadorAritmetico.suma(a, b);
		assertEquals(esperado, suma);
	}

	@Test
	public void divisionConCero() {
		int a = 8;
		int b = 0;
		int division;
		try {
			division = OperadorAritmetico.division(a, b);
			fail("Debería haber entrado al catch");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void division() {
		int esperado = 2;
		int a = 8;
		int b = 4;
		int division;
		try {
			division = OperadorAritmetico.division(a, b);
			assertEquals(esperado, division);
		} catch (Exception e) {
			fail();
		}
	}
}
