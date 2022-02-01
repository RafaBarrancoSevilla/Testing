/**
 * 
 */
package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Rafita
 *
 */
public class ProductTest {

	/**
	 * Test method for {@link ejerciciosUnitarias.Product#Product(java.lang.String, double)}.
	 */
	@Test
	public void testProductStringDouble() {
		Product a  = new Product("CremaSolar",4);
		
		assertEquals("CremaSolar", a.getTitle());
		assertEquals(4, a.getPrice());
	}

	/**
	 * Test method for {@link ejerciciosUnitarias.Product#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsProduct() {
		Product a  = new Product("CepilloDientes",1);
		Product b= new Product("Peine",1);
		
		assertFalse(a.equals(b),"Error");
	}

}
