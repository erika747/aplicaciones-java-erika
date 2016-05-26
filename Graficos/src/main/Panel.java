package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private float x;
	private float y;
	private float vx= 0.05f;
	private float vy = 0.1f;
	private float x2;
	private float y2;
	private float x3;
	private float y3;
	private float vx3 = 0.3f;
	private float vy3 = 0.1f;
	private float vx2 = 0.1f;
	private float vy2 = 0.2f;
	private float w = 10f;
	private float h = 10f;
	private float vh = 0.01f;
	private float vw = 0.01f;
	

	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval((int) x, (int) y, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval((int)x2, (int) y2, 100, 100);
		g.setColor(Color.CYAN);
		g.fillRect((int)x3, (int) y3, (int)w,(int) h);
		x=x+vx;
		y = y + vy;
		x2 = x2 + vx2;
		y2 = y2 + vy2;
		x3 = x3 + vx3;
		y3 = y3 + vy3;
		w = w + vw;
		h = h + vh;
		
		if (x > 500){
			vx = vx * -1;
		}
		if (x < 0){
			vx = vx * -1;
		}
		if (y > 500){
			vy = vy * -1;
		}
		if (y < 0){
			vy = vy * -1;
		}
		
		
		if (x2 > 500){
			vx2 = vx2 *-1;
		}
		if (x2 < 00){
			vx2 = vx2 *-1;
		}
		if (y2 > 500){
			vy2 = vy2 * -1;
		}
		if (y2 < 0){
			vy2 = vy2 * -1;
		}
		
		if (x3 > 500){
			vx3 = vx3 * -1;
		}
		if (x3 < 0){
			vx3 = vx3*-1;
		}
		if (y3 > 500){
			vy3 = vy3 *-1;
		}
		if (y3 < 0){
			vy3 = vy3 *-1;
		}
		if (w> 100){
			vw = vw * -1;
		}
		if (h > 100){
			vh = vh*-1;
		}
		if (w < 10){
			vw = vw * -1;
		}
		if (h < 10){
			vh = vh* -1;
		}
		
		
		
		g.setColor(Color.YELLOW);
		g.drawString("y = " + y, 50, 750);
		g.drawString("x = "+x, 50, 720);
		g.setColor(Color.BLUE);
		g.drawString("y = " + y2, 350, 750);
		g.drawString("x = " + x2, 350, 720);
		repaint();
	}
	
}
