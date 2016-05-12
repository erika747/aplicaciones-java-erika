package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Introduce una velocidad que estara en Km/s");
		int b = Integer.parseInt(a);
		System.out.println(b + " Km/h");
		System.out.println(b/3.6 + " m/s");
		
	}

}
