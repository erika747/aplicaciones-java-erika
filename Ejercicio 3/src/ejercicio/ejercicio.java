package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog("Elige un numero para n.");
		int n = Integer.parseInt(m);
		System.out.println(n);
		System.out.println("n + 55 = " + (n+55));
		n = n+55;
		System.out.println(n);
		System.out.println("n - 30 = " + (n-30));
		n = n - 30;
		System.out.println(n);
		System.out.println("n * 2 = " + (n*2));
		n = n*2;
		System.out.println(n);

	}

}
