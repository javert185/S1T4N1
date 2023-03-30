package s1t4n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoDniTest {
	
	//Dissenyem un test per comprovar que el programa calcula bé les lletres posant DNI pre-definits
	@Test
	void prova76456521() {
		assertEquals("J", CalculoDni.calculDni(76456521));
	}
	
	@Test
	void prova11112222() {
		assertEquals("W", CalculoDni.calculDni(11112222));
	}
	
	@Test
	void prova75998355() {
		assertEquals("F", CalculoDni.calculDni(75998355));
	}
	
	@Test
	void prova77335544() {
		assertEquals("E", CalculoDni.calculDni(77335544));
	}
	
	@Test
	void prova12345678() {
		assertEquals("Z", CalculoDni.calculDni(12345678));
	}
	
	@Test
	void prova34231234() {
		assertEquals("N", CalculoDni.calculDni(34231234));
	}
	
	@Test
	void prova87878787() {
		assertEquals("L", CalculoDni.calculDni(87878787));
	}
	
	@Test
	void prova27746132() {
		assertEquals("J", CalculoDni.calculDni(27746132));
	}
	
	@Test
	void prova21773866() {
		assertEquals("L", CalculoDni.calculDni(21773866));
	}
	
	@Test
	void prova87266555() {
		assertEquals("R", CalculoDni.calculDni(87266555));
	}
}