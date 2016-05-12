package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("Introduce un numero de 5 cifras");
		int b = Integer.parseInt(a);
		
		int u = b % 10;
		int d = (b % 100)/10;
		int c = (b%1000)/100;
		int m = (b%10000)/1000;
		int dm = (b%100000)/10000;
		System.out.println(dm);
		System.out.println(m);
		System.out.println(c);
		System.out.println(d);
		System.out.println(u);
	}

}
