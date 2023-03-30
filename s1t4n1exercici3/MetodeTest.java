package s1t4n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MetodeTest {
	
	int[] num2 = {5,5};
	
	@Test
	void MetodeArrayIndexOutOfBoundsEexception() {
		
		//Fem servir junit per comprovar que es llança l'excepció
		assertThrows(ArrayIndexOutOfBoundsException.class, () ->
		Metode.metode_erroni(num2));		
	}
}