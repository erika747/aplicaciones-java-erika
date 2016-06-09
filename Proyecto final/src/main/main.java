package main;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ventana v = new Ventana();
			v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			v.setSize(800,800);
			Container p = new Panel();
			p.setBackground(Color.DARK_GRAY);
			v.setContentPane(p);
			v.setVisible(true);
	}

}
