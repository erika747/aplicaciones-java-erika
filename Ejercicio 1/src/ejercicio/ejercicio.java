package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Introduce un numero para n");
		int n = Integer.parseInt(s);
		System.out.println("n: " + n);
		String h = JOptionPane.showInputDialog("Introduce un numero para a");
		double a = Integer.parseInt(h);
		System.out.println("a: " + a);
		String d = JOptionPane.showInputDialog("Introduce un character");
		char c = d.charAt(0);
		System.out.println("c: " + c);
		a = n+a;
		System.out.println(a);
		a = 15.7;
		a = a - n;
		System.out.println(a);

	}

}
