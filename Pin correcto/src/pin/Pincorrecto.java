package pin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Pincorrecto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pincorrecto window = new Pincorrecto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pincorrecto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 879, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String componente = JOptionPane.showInputDialog("¿Que componente arduino vas a utilizar?");
		
		
		BotonGuay btnpin0 = new BotonGuay("pin 0", new Color(0,255,0,128));
		
		btnpin0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(!btnpin0.activado()){
					btnpin0.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el "  + componente + " en el pin 1");
				}else{
					btnpin0.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 0");
				}
				
				
			}
		});
		
		btnpin0.setBounds(24, 156, 68, 30);
		frame.getContentPane().add(btnpin0);
		
		BotonGuay btnpin1 = new BotonGuay("pin 1", new Color(0,255,0,128));
		btnpin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin1.activado()){
					btnpin1.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el "  + componente + " en el pin 1");
				}else{
					btnpin1.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente  + " del pin 1");
				}
			}
		});
		btnpin1.setBounds(102, 156, 68, 30);
		frame.getContentPane().add(btnpin1);
		
		
		
		JLabel lblEligaElPin = new JLabel("Eliga el pin donde quiere introducir el " + componente + ".");
		lblEligaElPin.setBounds(311, 27, 312, 137);
		frame.getContentPane().add(lblEligaElPin);
		
		BotonGuay btnpin2 = new BotonGuay("pin 2", new Color(0,255,0,128));
		btnpin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin2.activado()){
					btnpin2.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 2");
				}else{
					btnpin2.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 2");
				}
			}
		});
		btnpin2.setBounds(180, 156, 68, 30);
		frame.getContentPane().add(btnpin2);
		
		BotonGuay btnpin3 = new BotonGuay("pin 3", new Color(0,255,0,128));
		btnpin3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin3.activado()){
					btnpin3.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 3");
				}else{
					btnpin3.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 3");
				}
			}
		});
		btnpin3.setBounds(258, 156, 68, 30);
		frame.getContentPane().add(btnpin3);
		
		BotonGuay btnpin4 = new BotonGuay("pin 4", new Color(0,255,0,128));
		btnpin4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin4.activado()){
					btnpin4.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 4");
				}else{
					btnpin4.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 4");
				}
			}
		});
		btnpin4.setBounds(336, 156, 68, 30);
		frame.getContentPane().add(btnpin4);
		
		BotonGuay btnpin5 = new BotonGuay("pin 5", new Color(0,255,0,128));
		btnpin5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin5.activado()){
					btnpin5.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 5");
				}else{
					btnpin5.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 5");
				}
			}
		});
		btnpin5.setBounds(414, 156, 68, 30);
		frame.getContentPane().add(btnpin5);
		
		BotonGuay btnpin6 = new BotonGuay("pin 6", new Color(0,255,0,128));
		btnpin6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin6.activado()){
					btnpin6.activar();
					JOptionPane.showMessageDialog(null, "Debes introducr el " + componente + " en el pin 6");
				}else{
					btnpin6.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 6");
				}
			}
		});
		btnpin6.setBounds(492, 156, 68, 30);
		frame.getContentPane().add(btnpin6);
		
		BotonGuay btnpin7 = new BotonGuay("pin 7", new Color(0,255,0,128));
		btnpin7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin7.activado()){
					btnpin7.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 7");
				}else{
					btnpin7.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 7");
				}
			}
		});
		btnpin7.setBounds(570, 156, 68, 30);
		frame.getContentPane().add(btnpin7);
		
		BotonGuay btnpin8 = new BotonGuay("pin 8", new Color(0,255,0,128));
		btnpin8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin8.activado()){
					btnpin8.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 8");
				}else{
					btnpin8.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 8");
				}
			}
		});
		btnpin8.setBounds(648, 156, 68, 30);
		frame.getContentPane().add(btnpin8);
		
		BotonGuay btnpin9 = new BotonGuay("pin 9", new Color(0,255,0,128));
		btnpin9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin9.activado()){
					btnpin9.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 9");
				}else{
					btnpin9.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 9");
				}
			}
		});
		btnpin9.setBounds(726, 156, 68, 30);
		frame.getContentPane().add(btnpin9);
		
		BotonGuay btnpin10 = new BotonGuay("pin 10", new Color(0,255,0,128));
		btnpin10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin10.activado()){
					btnpin10.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 10.");
				}else{
					btnpin10.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 10");
				}
			}
		});
		btnpin10.setBounds(168, 214, 80, 30);
		frame.getContentPane().add(btnpin10);
		
		BotonGuay btnpin11 = new BotonGuay("pin 11", new Color(0,255,0,128));
		btnpin11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin11.activado()){
					btnpin11.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente +" en el pin 11");
				}else{
					btnpin11.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 11");
				}
			}
		});
		btnpin11.setBounds(301, 214, 80, 30);
		frame.getContentPane().add(btnpin11);
		
		BotonGuay btnpin12 = new BotonGuay("pin 12", new Color(0,255,0,128));
		btnpin12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin12.activado()){
					btnpin12.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 12");
				}else{
					btnpin12.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 12");
				}
			}
		});
		btnpin12.setBounds(443, 214, 80, 30);
		frame.getContentPane().add(btnpin12);
		
		BotonGuay btnpin13 = new BotonGuay("pin 13", new Color(0,255,0,128));
		btnpin13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpin13.activado()){
					btnpin13.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin 13");
				}else{
					btnpin13.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin 13");
				}
			}
		});
		btnpin13.setBounds(573, 214, 80, 30);
		frame.getContentPane().add(btnpin13);
		
		BotonGuay btnpina0 = new BotonGuay("pin A0", new Color(0,255,0,128));
		btnpina0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpina0.activado()){
					btnpina0.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin analogico A0");
				}else{
					btnpina0.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin A0");
				}
			}
		});
		btnpina0.setBounds(47, 413, 89, 23);
		frame.getContentPane().add(btnpina0);
		
		BotonGuay btnpina1 = new BotonGuay("pin A1", new Color(0,255,0,128));
		btnpina1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpina1.activado()){
					btnpina1.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin analogico A1");
				}else{
					btnpina1.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin A1");
				}
			}
		});
		btnpina1.setBounds(159, 413, 89, 23);
		frame.getContentPane().add(btnpina1);
		
		BotonGuay btnpina2 = new BotonGuay("pin A2", new Color(0,255,0,128));
		btnpina2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpina2.activado()){
					btnpina2.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin analogico A2");
				}else{
					btnpina2.desActivar();
					JOptionPane.showMessageDialog(null, ">Debes quitar el " + componente + " del pin A2");
				}
			}
		});
		btnpina2.setBounds(267, 413, 89, 23);
		frame.getContentPane().add(btnpina2);
		
		BotonGuay btnpina3 = new BotonGuay("pin A3", new Color(0,255,0,128));
		btnpina3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpina3.activado()){
					btnpina3.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + "en el pin analogico A3");
				}else{
					btnpina3.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin A3");
				}
			}
		});
		btnpina3.setBounds(378, 413, 89, 23);
		frame.getContentPane().add(btnpina3);
		
		BotonGuay btnpina4 = new BotonGuay("pin A4", new Color(0,255,0,128));
		btnpina4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpina4.activado()){
					btnpina4.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin analogico A4");
				}else{
					btnpina4.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin A4");
				}
			}
		});
		btnpina4.setBounds(492, 413, 89, 23);
		frame.getContentPane().add(btnpina4);
		
		BotonGuay btnpina5 = new BotonGuay("pin A5", new Color(0,255,0,128));
		btnpina5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnpina5.activado()){
					btnpina5.activar();
					JOptionPane.showMessageDialog(null, "Debes introducir el " + componente + " en el pin analogico A5");
				}else{
					btnpina5.desActivar();
					JOptionPane.showMessageDialog(null, "Debes quitar el " + componente + " del pin A5");
				}
			}
		});
		btnpina5.setBounds(607, 413, 89, 23);
		frame.getContentPane().add(btnpina5);
	}
}
