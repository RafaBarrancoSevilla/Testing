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
class ShoppingCartTest {

	/**
	 * Test method for {@link ejerciciosUnitarias.ShoppingCart#getBalance()}.
	 */
	@Test
	void testGetBalance() {
		ShoppingCart s = new ShoppingCart();
		Product a  = new Product("CremaSolar",4);
		
		s.addItem(a);
		assertEquals(4,s.getBalance(),"Error");
	}

	/**
	 * Test method for {@link ejerciciosUnitarias.ShoppingCart#addItem(ejerciciosUnitarias.Product)}.
	 */
	@Test
	void testAddItem() {
		ShoppingCart s = new ShoppingCart();
		Product b= new Product("Peine",1);
		
		s.addItem(b);
		assertEquals(1,s.getItemCount(),"Error");
	}

	/**
	 * Test method for {@link ejerciciosUnitarias.ShoppingCart#removeItem(ejerciciosUnitarias.Product)}.
	 */
	@Test
	void testRemoveItem(){
		ShoppingCart s = new ShoppingCart();
		Product b= new Product("Peine",1);
		
		try {
			s.removeItem(b);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0,s.getItemCount(),"Error");
	}

	/**
	 * Test method for {@link ejerciciosUnitarias.ShoppingCart#getItemCount()}.
	 */
	@Test
	void testGetItemCount() {
		ShoppingCart s = new ShoppingCart();
		Product b= new Product("Peine",1);
		
		s.addItem(b);
		assertEquals(1, s.getItemCount(),"Error");
	}

	/**
	 * Test method for {@link ejerciciosUnitarias.ShoppingCart#empty()}.
	 */
	@Test
	void testEmpty() {
		ShoppingCart s = new ShoppingCart();
		Product b= new Product("Peine",1);
		
		s.addItem(b);
		s.empty();
		assertEquals(0,s.getItemCount(),"Error");
	}

}
