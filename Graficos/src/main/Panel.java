package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private float x;
	private float y;
	private float vx= 0.5f;
	private float vy = 0.3f;
	private float x2;
	private float y2;
	private float x3;
	private float y3;
	private float x4;
	private float y4;
	private float x5;
	private float y5;
	private float vx3 = 0.6f;
	private float vy3 = 0.4f;
	private float vx2 = 0.7f;
	private float vy2 = 0.6f;
	private float vx4 = 0.5f;
	private float vy4 = 0.4f;
	private float vx5 = 0.4f;
	private float vy5 = 0.3f;
	private float w = 10f;
	private float h = 10f;
	private float vh = 0.01f;
	private float vw = 0.01f;
	private float xt1 = 100f;
	private float yt1 = 50f;
	private float tvx = 0.5f;
	private float tvy = 0.5f;
	private float xt2 = 100f;
	private float yt2 = 200f;
	private float xt3 = 300f;
	private float yt3 = 200f;
	private float width = 100;
	private float height = 100;
	
	
	Color rojo = new Color(255, 255, 0);
	Color rojo2 = new Color(0, 0, 255);
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.CYAN);
		g.fillOval((int) x, (int) y, 100, 100);
		g.setColor(Color.PINK);
		g.fillOval((int)x2, (int) y2, 100, 100);
		g.setColor(Color.YELLOW);
		g.fillRect((int)x3, (int) y3, (int)w,(int) h);
		g.setColor(rojo);
		g.fillRect((int)x4, (int) y4,(int) width, (int) height);
		g.setColor(rojo2);
		g.fillRect((int)x5, (int) y5, (int)width, (int) height);
		Polygon p = new Polygon();
		p.addPoint((int)xt1, (int) yt1);
		p.addPoint((int)xt2, (int) yt2);
		p.addPoint((int)xt3, (int)yt3);
		g.setColor(Color.MAGENTA);
		g.fillPolygon(p);
		x=x+vx;
		y = y + vy;
		x2 = x2 + vx2;
		y2 = y2 + vy2;
		x3 = x3 + vx3;
		y3 = y3 + vy3;
		x4 = x4 + vx4;
		x5 = x5 + vx5;
		y4 = y4 + vy4;
		y5 = y5 +vy5;
		w = w + vw;
		h = h + vh;
		xt1 = xt1 + tvx;
		yt1 = yt1 + tvy;
		xt2 = xt2 +tvx;
		yt2 = yt2 + tvy;
		xt3 = xt3 + tvx;
		yt3 = yt3 + tvy;
		if (x4 < x5 + width &&
				   x4 + width > x5 &&
				   y4 < y5 + height &&
				   height + y4 > y5) {
				    rojo = new Color(255,0,0);
				    rojo2 = new Color(255, 0,0);
				}else{
					rojo = new Color(255, 155, 0);
					rojo2 = new Color(0,0,255);
				}
		if (x4 > 1500){
			vx4 = vx4 *-1;
		}
		if (x4 <0){
			vx4 = vx4 *-1;
		}
		if (y4 > 750){
			vy4 = vy4 *-1;
		}
		if(y4 <0){
			vy4 = vy4 * -1;
		}
		if (x5 > 1500){
			vx5 = vx5 * -1;
		}
		if (x5 < 0){
			vx5 = vx5 * -1;
		}
		if(y5>750){
			vy5 = vy5 * -1;
		}
		if ( y5 < 0){
			vy5 = vy5 * -1;
		}
		if (xt3>1500){
			tvx = tvx*-1;
		}
		if (yt2 >700 && yt3>700){
			tvy = tvy*-1;
		}
		if (yt1 < 0){
			tvy = tvy *-1;
		}
		if (xt1< 0 ){
			tvx = tvx * -1;
		}
		
		if (x >1500){
			vx = vx * -1;
		}
		if (x < 0){
			vx = vx * -1;
		}
		if (y > 700){
			vy = vy * -1;
		}
		if (y < 0){
			vy = vy * -1;
		}
		
		
		if (x2 > 1500){
			vx2 = vx2 *-1;
		}
		if (x2 < 00){
			vx2 = vx2 *-1;
		}
		if (y2 > 700){
			vy2 = vy2 * -1;
		}
		if (y2 < 0){
			vy2 = vy2 * -1;
		}
		
		if (x3 > 1500){
			vx3 = vx3 * -1;
		}
		if (x3 < 0){
			vx3 = vx3*-1;
		}
		if (y3 > 700){
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
		g.drawString("y = " + y2, 150, 750);
		g.drawString("x = " + x2, 150, 720);
		g.setColor(Color.CYAN);
		g.drawString(" " + y3, 250, 750);
		g.drawString(" " + x3, 250, 720);
		repaint();
	}
	
}
