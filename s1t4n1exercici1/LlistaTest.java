package s1t4n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LlistaTest {
	
	//Fem un test per mirar si la llista té 12 posicions
	@Test
	void llista12Posicions() {
		
		Llista llista_mesos = new Llista();
		assertTrue(llista_mesos.insereix_llista().size() == 12);
	}
	
	//Fem un test per mirar si no es nul·La
	@Test
	void llistaNoNulla() {
		Llista llista_mesos = new Llista();
		assertNotNull(llista_mesos.insereix_llista());
	}
	
	//Fem un test per comprovar que estigui el mes d'agost
	@Test
	void posicio8Agost() {
		Llista llista_mesos = new Llista();
		assertEquals("Agost", llista_mesos.insereix_llista().get(7));
	}
}