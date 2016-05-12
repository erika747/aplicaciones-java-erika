package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Introduce el radio.");
		int r = Integer.parseInt(a);
		System.out.println(4/3*3.14*r*r*r);
		

	}

}
