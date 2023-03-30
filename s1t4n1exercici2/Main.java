package s1t4n1exercici2;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		//Preguntem a l'usuari per les dades		
		int numeros_dni = Integer.parseInt(JOptionPane.showInputDialog("Fica el DNI sense lletra: "));
		
		//Fem el càlcul de la lletra i el retornem
		String lletra = CalculoDni.calculDni(numeros_dni);
		
		//Imprimim per pantalla el número
		System.out.println(lletra);
	}	
}