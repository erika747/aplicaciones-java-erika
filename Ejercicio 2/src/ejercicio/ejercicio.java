package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("Introduce un numero para e");
	int e = Integer.parseInt(s);
	String h = JOptionPane.showInputDialog("Introduce un numero para x");
	int x = Integer.parseInt(h);
	String f = JOptionPane.showInputDialog("Introduce un numero para y");
	int y = Integer.parseInt(f);
	String g = JOptionPane.showInputDialog("Introduce un numero para n");
	double n = Double.parseDouble(g);
	String l = JOptionPane.showInputDialog("Introduce un numero para m");
	double m = Double.parseDouble(l);
	System.out.println("x + y = " + (x+y));
	System.out.println("e + n = " + (e+n));
	System.out.println("n + m = " + (n+m));

	}

}
