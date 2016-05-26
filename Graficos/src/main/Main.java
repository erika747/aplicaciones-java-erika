package main;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args){
		//1 crear ventana
		Ventana v = new Ventana();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setSize(800,800);
		Container p = new Panel();
		p.setBackground(Color.BLACK);
		v.setContentPane(p);
		v.setVisible(true);
	}
	
}
