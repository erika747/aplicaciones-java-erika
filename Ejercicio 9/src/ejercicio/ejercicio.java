package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Introduce el valor del radio de una circumferencia");
		int b = Integer.parseInt(a);
		System.out.print("Longitud de la circumferencia: ");
		System.out.println(2*3.14*b);
		System.out.print("Area de la circumferencia: ");
		System.out.print(3.14*(b*b));

	}

}
