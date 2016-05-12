package texto;

import javax.swing.JOptionPane;

public class textoenpantalla {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Escribe el texto que quieres que aparezca en la consola.");
		System.out.println(texto);
	}

}
