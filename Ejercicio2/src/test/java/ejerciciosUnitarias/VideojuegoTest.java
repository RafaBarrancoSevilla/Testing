package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VideojuegoTest {

	@Test
	void testGetTitulo() {
		Videojuego v = new Videojuego();
		
		v.setTitulo("FIFA 22");
		assertEquals("FIFA 22", v.getTitulo());
	}

	@Test
	void testSetTitulo() {
		Videojuego v = new Videojuego();
		
		v.setTitulo("FIFA 22");
		assertEquals("FIFA 22", v.getTitulo());
	} 

	@Test
	void testGetHorasEstimadas() {
		Videojuego v = new Videojuego();
		
		v.setHorasEstimadas(180);
		assertEquals(180, v.getHorasEstimadas());
	}

	@Test
	void testSetHorasEstimadas() {
		Videojuego v = new Videojuego();
		
		v.setHorasEstimadas(180);
		assertEquals(180, v.getHorasEstimadas());
	}

	@Test
	void testGetGenero() {
		Videojuego v = new Videojuego();
		
		v.setGenero("Deportes");
		assertEquals("Deportes", v.getGenero());
	}

	@Test
	void testSetGenero() {
		Videojuego v = new Videojuego();
		
		v.setGenero("Deportes");
		assertEquals("Deportes", v.getGenero());
	}

	@Test
	void testGetcompania() {
		Videojuego v = new Videojuego();
		
		v.setcompania("Electronic Arts");
		assertEquals("Electronic Arts", v.getcompania());
	}

	@Test
	void testSetcompania() {
		Videojuego v = new Videojuego();
		
		v.setcompania("Electronic Arts");
		assertEquals("Electronic Arts", v.getcompania());
	}

	@Test
	void testEntregar() {
		Videojuego v = new Videojuego();
		
		v.entregar();
		assertTrue(v.isEntregado(),"Error");
	}

	@Test
	void testDevolver() {
		Videojuego v = new Videojuego();
		
		v.devolver();
		assertFalse(v.isEntregado(),"Error");
	}

	@Test
	void testIsEntregado() {
		Videojuego v = new Videojuego();
		
		v.entregar();
		assertTrue(v.isEntregado(),"Error");
	}

	@Test
	void testCompareTo() {
		Videojuego v = new Videojuego();
		Videojuego a = new Videojuego();
		
		v.setHorasEstimadas(180);
		a.setHorasEstimadas(180);

		assertEquals(0,v.compareTo(a));
	}

	@Test
	void testToString() {
		Videojuego v = new Videojuego();
		
		v.setTitulo("FIFA 22");
		v.setGenero("Deportes");
		v.setHorasEstimadas(180);
		v.setcompania("Electronic Arts");
		
		assertNotNull((v),"Error");
	}
	
	@Test
	void testEqualsVideojuego() {
		Videojuego v = new Videojuego();
		Videojuego a = new Videojuego();
		
		v.setTitulo("FIFA 22");
		v.setcompania("Electronic Arts");
		a.setTitulo("PUBG");
		a.setcompania("PUBG Corporation");
		
		assertFalse(v.equals(a),"Error");
	}

	@Test
	void testVideojuego() {
		Videojuego v = new Videojuego();
		
		assertNotNull(v);
	}

	@Test
	void testVideojuegoStringString() {
		Videojuego v = new Videojuego("FIFA 22", "Electronic Arts");
		
		assertEquals(("FIFA 22"),v.getTitulo());
		assertEquals(("Electronic Arts"),v.getcompania());
	}

	@Test
	void testVideojuegoStringIntStringString() {
		Videojuego v = new Videojuego("FIFA 22", 180, "Deportes", "Electronic Arts");
		
		assertEquals(("FIFA 22"),v.getTitulo());
		assertEquals((180),v.getHorasEstimadas());
		assertEquals(("Deportes"),v.getGenero());
		assertEquals(("Electronic Arts"),v.getcompania());
		
	}

}
