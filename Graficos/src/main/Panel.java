package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private float[] x = new float[5];
	private float[] vx = new float[]{0.05f, 0.1f, 0.3f, 0.01f, 0.03f};
	private float[] widths = new float[]{100, 100, 100,100,100};
	private float[] y = new float[5];
	private float[] vy = new float []{0.1f, 0.2f, 0.1f, 0.05f, 0.02f};

	private float h = 10f;
	private float vh = 0.01f;
	private float vw = 0.01f;
	
	private float[] heights = new float []{100, 100, 100, 100, 100};
	private int limiteDerecho = 630;
	private int limiteIzquierdo = 50;
	private int limiteAbajo = 650;
	private int limiteArriba = 50;
	private float height2 = 100;
	private int diametro2 = 100;
	
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		dibujarObjetos(g);
		
		mover();
		
		comprobarLimites();
		
		cambiarCuadrado();
		
		dibujarTexto(g);
		
		repaint();
	}




	private void dibujarTexto(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("y = " + y[0], 50, 750);
		g.drawString("x = "+x[0], 50, 720);
		g.setColor(Color.BLUE);
		g.drawString("y = " + y[1], 350, 750);
		g.drawString("x = " + x[1], 350, 720);
	}


	private void mover() {
		x[0]=x[0]+vx[0];
		y[0] = y[0] + vy[0];
		x[1] = x[1] + vx[1];
		y[1] = y[1] + vy[1];
		x[2] = x[2] + vx[2];
		y[2] = y[2] + vy[2];
		x[3] = x[3] + vx[3];
		x[4] = x[4] + vx[4];
		y[3] = y[3] + vy[3];
		y[4] = y[4] + vy[4];
		widths[2] = widths[2] + vw;
		h = h + vh;
	}




	public void cambiarCuadrado(){
		if (widths[2]> 100){
			vw = vw * -1;
		}
		if (h > 100){
			vh = vh*-1;
		}
		if (widths[2] < 10){
			vw = vw * -1;
		}
		if (h < 10){
			vh = vh* -1;
		}
	}






	private void dibujarObjetos(Graphics g) {
		g.drawLine(limiteDerecho,limiteArriba, limiteDerecho, limiteAbajo);
		g.drawLine(limiteIzquierdo, limiteArriba, limiteIzquierdo, limiteAbajo);
		g.drawLine(limiteIzquierdo, limiteArriba, limiteDerecho, limiteArriba);
		g.drawLine(limiteIzquierdo, limiteAbajo, limiteDerecho, limiteAbajo);
		g.setColor(Color.YELLOW);
		g.fillOval((int) x[0], (int) y[0], (int)widths[0], (int) heights[0]);
		g.setColor(Color.BLUE);
		g.fillOval((int)x[1], (int) y[1], (int)widths[1], (int)widths[1]);
		g.setColor(Color.CYAN);
		g.fillRect((int)x[2], (int) y[2], (int)widths[2],(int) h);
		
		g.fillRect((int)x[3], (int) y[3], (int)widths[3], (int)heights[3]);
		g.fillRect((int)x[4],(int) y[4], (int)widths[4], (int) height2);
	}
	
	
	private void comprobarLimites() {
		for(int i=0; i<x.length; i++){
			if (x[i] > limiteDerecho-widths[i]){
				vx[i] = vx[i] * -1;
				x[i] = limiteDerecho-widths[i];
			}
			if  (x[i] < limiteIzquierdo){
				vx[i] = vx[i] * -1;
				x[i] = limiteIzquierdo;
			}
		}
		if (y[3] > limiteAbajo-heights[3]){
			vy[3] = vy[3] * -1;
			y[3] = limiteAbajo-heights[3];
		}
		if ( y[3]  < limiteArriba){
			vy[3] = vy[3] * -1;
			y[3] = limiteArriba;
		}
		if ( y[4] > limiteAbajo-height2){
			vy[4] = vy[4] * -1;
			y[4] = limiteAbajo-height2;
		}
		if (y[4] < limiteArriba){
			vy[4] = vy[4] * -1;
			y[4] = limiteArriba;
		}
		if (y[0] > limiteAbajo-heights[0]){
			vy[0] = vy[0] * -1;
			y[0] = limiteAbajo-heights[0];
		}
		if (y[0] < limiteArriba){
			vy[0] = vy[0] * -1;
			y[0] = limiteArriba;
		}
		if (y[1] > limiteAbajo-diametro2){
			vy[1] = vy[1] * -1;
			y[1] = limiteAbajo-diametro2;
		}
		if (y[1] < limiteArriba){
			vy[1] = vy[1] * -1;
			y[1] = limiteArriba;
		}
		if (y[2] > limiteAbajo-h){
			vy[2] = vy[2] *-1;
			y[2] = limiteAbajo-h;
		}
		if (y[2] < limiteArriba){
			vy[2] = vy[2] *-1;
			y[2] = limiteArriba;
		}
	}
	
}
