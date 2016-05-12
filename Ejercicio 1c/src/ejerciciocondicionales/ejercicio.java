package ejerciciocondicionales;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Introduce un numero");
		int b = Integer.parseInt(a);
		if(b > -1){
			System.out.println("Tu numero es positivo");
		}else{
			System.out.println("Tu numero es negativo");
		}

	}

}
