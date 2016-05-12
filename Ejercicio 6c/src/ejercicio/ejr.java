package ejercicio;

import javax.swing.JOptionPane;

public class ejr {

	public static void main(String[] args) {
			String a = JOptionPane.showInputDialog("Introduce un numero");
			String b = JOptionPane.showInputDialog("Introduce otro numero");
			String c = JOptionPane.showInputDialog("Introduce otro numero");
			int d = Integer.parseInt(a);
			int e = Integer.parseInt(b);
			int f = Integer.parseInt(c);
			int g;
			if(d>e){
				g = d;
				if (f>g){
					g = f;
				}
			}else{
				g = e;
				if (f>g){
					g = f;
				}
			}
			System.out.println("El numero mas grande es " + g);
			
	}

}
