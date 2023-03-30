package s1t4n1exercici1;

import java.util.ArrayList;

public class Llista {
	
	public static ArrayList insereix_llista() {
		
		//Creem una ArrayList
		ArrayList<String> llista_mesos = new ArrayList<>();
						
		//Afegim els mesos 
		llista_mesos.add("Gener");
		llista_mesos.add("Febrer");
		llista_mesos.add("Març");
		llista_mesos.add("Abril");
		llista_mesos.add("Maig");
		llista_mesos.add("Juny");
		llista_mesos.add("Juliol");
		llista_mesos.add("Agost");
		llista_mesos.add("Setembre");
		llista_mesos.add("Octubre");
		llista_mesos.add("Novembre");
		llista_mesos.add("Desembre");
		
		//Retornem l'ArrayList amb els mesos de l'any
		return llista_mesos;	
	}

}
