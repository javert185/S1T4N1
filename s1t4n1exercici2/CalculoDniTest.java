package s1t4n1exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class CalculoDniTest {
	
	//Dissenyem un test per comprovar que el programa calcula bé les lletres posant DNI pre-definits
	@ParameterizedTest
	@ValueSource(strings = {"76456521J", "11112222W", "75998355F", "77335544E", "12345678Z", "34231234N", "87878787L", "27746132J", "21773866L", "87266555R"})
	
	void provaDnis(String dni) {
		assertEquals(dni.substring(8),CalculoDni.calculDni(Integer.parseInt(dni.substring(0, 8))));
	}
}