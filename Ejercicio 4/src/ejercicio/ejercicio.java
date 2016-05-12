package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String c = JOptionPane.showInputDialog("Elige un numero para a");
		String d = JOptionPane.showInputDialog("Elige un numero para b");
		
		int a =Integer.parseInt(c);
		int b = Integer.parseInt(d);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		int e = a;
		a = b;
		b = e;
		
		System.out.println("a: " + a);
		
		
		System.out.println("b: " + b);

	}

}
