package pin;

import javax.swing.JOptionPane;

public class pin {

	public static void main(String[] args) {
		String pin = JOptionPane.showInputDialog("Introduzca numero de pin");
		int pinNumber = Integer.parseInt(pin);
		if(pinNumber>13){
			pin = JOptionPane.showInputDialog("No puedes elegir un numero mayor de 13. Elige pin otra vez");
		}
		String comp = JOptionPane.showInputDialog("¿Qué componente va a utilizar?");
		System.out.println("Ha elegido el pin " + pin + ". Debe introducir el " + comp + " en el pin " + pin + ".");
		
		
	}

}
