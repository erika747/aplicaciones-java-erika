package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class Panel extends JPanel{

	Bola[] bolas = new Bola[5];

	Personaje personaje;
	
	Cuadrado cuadrado;
	
	private int limiteDerecho = 630;
	private int limiteIzquierdo = 50;
	private int limiteAbajo = 650;
	private int limiteArriba = 50;

	
	public Panel(){
		personaje = new Personaje(limiteDerecho, limiteAbajo);
		cuadrado = new Cuadrado(limiteDerecho, limiteAbajo);
		for(int i=0; i<bolas.length; i++){
			bolas[i] = new Bola(limiteDerecho, limiteAbajo);
			
		}
		
		setFocusable(true);
		requestFocus();
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int tecla = e.getKeyCode();
				
				if(tecla == 37){
					personaje.vx = -1;
				}
				if(tecla == 38){
					personaje.vy = -1;
				}
				if(tecla == 39){
					personaje.vx = 1;
				}
				if(tecla == 40){
					personaje.vy = 1;
				}
				
				if(tecla == 87){
					cuadrado.vy = -1;
				}
				if(tecla == 83){
					cuadrado.vy = 1;
				}
				if(tecla== 68){
					cuadrado.vx = 1;
				}
				if(tecla == 65){
					cuadrado.vx = -1;
				}
				
				if(tecla == 107 ){
					cuadrado.alto = Math.min(cuadrado.alto + 10, limiteAbajo - cuadrado.y);
					cuadrado.ancho = Math.min(cuadrado.ancho + 10, limiteDerecho - cuadrado.x);
				}
				if(tecla == 109 ){
					cuadrado.alto = Math.max(10,cuadrado.alto - 10);
					cuadrado.ancho = Math.max(10, cuadrado.ancho - 10);
				}
				
				System.out.println("press: " + tecla);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int tecla = e.getKeyCode();
				if(tecla == 37){
					personaje.vx = 0;
				}
				if(tecla == 38){
					personaje.vy = 0;
				}
				if(tecla == 39){
					personaje.vx = 0;
				}
				if(tecla == 40){
					personaje.vy = 0;
				}
				
				if(tecla == 87){
					cuadrado.vy = 0;
				}
				if(tecla == 83){
					cuadrado.vy = 0;
				}
				if(tecla == 68){
					cuadrado.vx = 0;
				}
				if ( tecla == 65){
					cuadrado.vx = 0;
				}
			}
			
		});
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);

		dibujarObjetos(g);

		mover();

		comprobarLimites();

		repaint();
	}

	private void mover() {
		for(int i=0; i<bolas.length; i++){
			bolas[i].mover();
			
		}
		
		personaje.mover();
		cuadrado.mover();
	}


	private void dibujarObjetos(Graphics g) {
		g.drawLine(limiteDerecho,limiteArriba, limiteDerecho, limiteAbajo);
		g.drawLine(limiteIzquierdo, limiteArriba, limiteIzquierdo, limiteAbajo);
		g.drawLine(limiteIzquierdo, limiteArriba, limiteDerecho, limiteArriba);
		g.drawLine(limiteIzquierdo, limiteAbajo, limiteDerecho, limiteAbajo);

		personaje.pintar(g);
		cuadrado.pintar(g);
		
		for(int i=0; i<bolas.length; i++){
			bolas[i].pintar(g);
		}
	}


	private void comprobarLimites() {
		for(int i=0; i<bolas.length; i++){
			bolas[i].comprobarLimites(limiteDerecho, limiteIzquierdo, limiteArriba, limiteAbajo);
			
		}
		personaje.comprobarLimites(limiteDerecho, limiteIzquierdo, limiteArriba, limiteAbajo);
		cuadrado.comprobarLimites(limiteDerecho, limiteIzquierdo, limiteArriba, limiteAbajo);
	}

}
