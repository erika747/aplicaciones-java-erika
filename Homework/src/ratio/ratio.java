package ratio;

import javax.swing.JOptionPane;

public class ratio {

	public static void main(String[] args) {
		String aratio = JOptionPane.showInputDialog("Introduce the number you want to get the ratio out of");
		double bratio = Double.parseDouble(aratio);
		String cratio = JOptionPane.showInputDialog("Introduce the first number of the ratio");
		int dratio = Integer.parseInt(cratio);
		String eratio = JOptionPane.showInputDialog("Introduce the second number of the ratio");
		int fratio = Integer.parseInt(eratio);
		double a = dratio+fratio;
		double b = bratio/a;
		double c = b*dratio;
		double d = b*fratio;
		JOptionPane.showMessageDialog(null, "The ratio is   " + c + ":" + d);
		
	}

}
