package n1exercici3.handlers;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProvaArrayTest {

	@Test
	void afegirNumerosTest() {
		ProvaArray array = new ProvaArray();
		array.afegirNumeros(100, 4);
	}
	
	@Test
	void afegirNumerosTest2(){
		ProvaArray array = new ProvaArray();
		
		assertEquals("java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5",
				array.afegirNumeros(100, 5));
	}
}
