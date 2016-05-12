package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String gradosenstring = JOptionPane.showInputDialog("Introduce un numero de grados centigrados");
		int c = Integer.parseInt(gradosenstring);
		System.out.print("F = ");
		System.out.print(32 + (9*c/5));
	}

}
