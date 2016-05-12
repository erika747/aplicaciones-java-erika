package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
			String primerapalabra = JOptionPane.showInputDialog("Introduce la primera palabra");
			String segundapalabra = JOptionPane.showInputDialog("Introduce la segunda palabra");
			if (primerapalabra.equals(segundapalabra)){
				System.out.println("Las dos palabras son iguales");
			}
	}

}
