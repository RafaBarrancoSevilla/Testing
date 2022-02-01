package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonaTest {


	@Test
	void testCalcularIMC() {
		Persona p = new Persona();
		
		p.setNombre("Rafa");
		p.setEdad(18);
		p.setAltura(183);
		p.setPeso(73);
		p.setSexo('H');
		
		assertEquals(0, p.calcularIMC(),"Error el método calcularIMC no va a ser nunca diferente a menos 1");
	}

	@Test
	void testEsMayorDeEdad() {
		Persona p = new Persona();
		p.setEdad(18);
		assertTrue(p.esMayorDeEdad(),"Error");
	}

	@Test
	void testToString() {
		Persona p = new Persona();
		
		p.setNombre("Rafa");
		p.setEdad(18);
		p.setAltura(183);
		p.setPeso(73);
		p.setSexo('H');
		
		assertNotNull((p),"Error");
	}

}
