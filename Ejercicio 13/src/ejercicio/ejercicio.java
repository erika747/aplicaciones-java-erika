package ejercicio;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Introduce un numero de 3 cifras");
		int b = Integer.parseInt(a);
		
		int unidades = b % 10;
		int decenas = ((b % 100) - (b % 10))/10 ;
		int centenas = ((b%1000)-(b%100))/100;
		System.out.println(unidades);
		System.out.println(decenas);
		System.out.println(centenas);
	}

}
