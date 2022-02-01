package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerieTest {

	@Test
	void testGetTitulo() {
		Serie s = new Serie();
		
		s.setTitulo("Breaking Bad");
		assertEquals("Breaking Bad", s.getTitulo());
	}

	@Test
	void testSetTitulo() {
		Serie s = new Serie();
		
		s.setTitulo("Breaking Bad");
		assertEquals("Breaking Bad", s.getTitulo());
	}

	@Test
	void testGetnumeroTemporadas() {
		Serie s = new Serie();
		
		s.setnumeroTemporadas(5);
		assertEquals(5, s.getnumeroTemporadas());
	}

	@Test
	void testSetnumeroTemporadas() {
		Serie s = new Serie();
		
		s.setnumeroTemporadas(5);
		assertEquals(5, s.getnumeroTemporadas());
	}

	@Test
	void testGetGenero() {
		Serie s = new Serie();
		
		s.setGenero("Drama");
		assertEquals("Drama", s.getGenero());
	}

	@Test
	void testSetGenero() {
		Serie s = new Serie();
		
		s.setGenero("Drama");
		assertEquals("Drama", s.getGenero());
	}

	@Test
	void testGetcreador() {
		Serie s = new Serie();
		
		s.setcreador("Vince Gilligan");
		assertEquals("Vince Gilligan",s.getcreador());
	}

	@Test
	void testSetcreador() {
		Serie s = new Serie();
		
		s.setcreador("Vince Gilligan");
		assertEquals("Vince Gilligan",s.getcreador());
	}

	@Test
	void testEntregar() {
		Serie s = new Serie();
		
		s.entregar();
		assertTrue(s.isEntregado(),"Error");
	}

	@Test
	void testDevolver() {
		Serie s = new Serie();
		
		s.devolver();
		assertFalse(s.isEntregado(),"Error");
	}

	@Test
	void testIsEntregado() {
		Serie s = new Serie();
		
		s.entregar();
		assertTrue(s.isEntregado(),"Error");
	}

	@Test
	void testCompareTo() {
		Serie s = new Serie();
		Serie a = new Serie();
		
		s.setnumeroTemporadas(5);
		a.setnumeroTemporadas(3);
		
		assertEquals(1,s.compareTo(a));
	}

	@Test
	void testToString() {
		Serie s = new Serie();
		
		s.setTitulo("Breaking Bad");
		s.setnumeroTemporadas(5);
		s.setGenero("Drama");
		s.setcreador("Vince Gilligan");
		
		assertNotNull((s),"Error");
	}

	@Test
	void testEqualsSerie() {
		Serie s = new Serie();
		Serie a = new Serie();
		
		s.setTitulo("Breaking Bad");
		s.setGenero("Drama");
		a.setTitulo("The Umbrella Academy");
		a.setGenero("Acción");
		
		assertFalse(s.equals(a),"Error");
	}

	@Test
	void testSerie() {
		Serie s = new Serie();
		
		assertNotNull(s);
	}

	@Test
	void testSerieStringString() {
		Serie s = new Serie("Breaking Bad","Vince Gilligan");
	
		assertEquals(("Breaking Bad"),s.getTitulo());
		assertEquals(("Vince Gilligan"),s.getcreador());
	}

	@Test
	void testSerieStringIntStringString() {
		Serie s = new Serie("Breaking Bad",5,"Drama","Vince Gilligan");
		
		assertEquals(("Breaking Bad"),s.getTitulo());
		assertEquals((5),s.getnumeroTemporadas());
		assertEquals(("Drama"),s.getGenero());
		assertEquals(("Vince Gilligan"),s.getcreador());
	}

}
