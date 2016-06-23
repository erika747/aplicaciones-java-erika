package main;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado {
	float x;
	float y;
	float vx;
	float vy;
	float alto;
	float ancho;
	Color color;
	
	public Cuadrado(int limiteDerecho, int limiteAbajo){
		x = (float) (Math.random() * limiteDerecho);
		y = (float) (Math.random() * limiteAbajo);
		vx = 0;
		vy = 0;
		ancho = (float) (Math.random() * 100);
		alto = (float) (Math.random() * 100);
		int r = (int) (Math.random()*255);
		int g = (int) (Math.random()*255);
		int b = (int) (Math.random()*255);
		color = new Color(r,g,b);
	}
	
	public void pintar(Graphics g){
		g.setColor(color);
		
		g.fillRect((int) x, (int) y, (int)ancho, (int) alto);
	}
	
	public void mover(){
		x = x + vx;
		y = y + vy;
	}
	
	public void comprobarLimites(int limiteDerecho, int limiteIzquierdo, int limiteArriba, int limiteAbajo){
		if (x > limiteDerecho-ancho){
			vx = 0;
			x = limiteDerecho-ancho;
		}
		if  (x < limiteIzquierdo){
			vx = 0;
			x = limiteIzquierdo;
		}
		if (y > limiteAbajo-alto){
			vy = 0;
			y = limiteAbajo-alto;
		}
		if  (y < limiteArriba){
			vy = 0;
			y = limiteArriba;
		}
	}
}
