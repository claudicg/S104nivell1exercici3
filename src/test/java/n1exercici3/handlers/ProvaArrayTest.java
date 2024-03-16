package n1exercici3.handlers;

import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

public class ProvaArrayTest {
	
	@Test
	void llancarExcepcioTest(){
		
		ProvaArray demo = new ProvaArray();
			
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {demo.llancarException();});
			
	}
}
