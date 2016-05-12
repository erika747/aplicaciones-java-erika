package ejerciciocondicionales;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("introduce un numero");
		int a = Integer.parseInt(b);
		int c = a%2;
		if (c==0){
			System.out.println("Tu numero es par");
		}else{
			System.out.println("Tu numero es impar");
		}

	}

}
