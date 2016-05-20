package area;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Panel extends JPanel{
	@Override
	public void paint(Graphics g){
		super.paint(g);
		if(area.modo==1){
			g.fillOval(200,  400,  (int)area.radius, (int)area.radius);
		}
		if (area.modo == 2){
			g.fillRect(200, 400, (int)area.heightsquare, (int)area.heightsquare);
		}
		if ( area.modo == 3){
			g.fillRect(200, 400, (int)area.lengthrectangle, (int)area.heightrectangle);
		}
		if ( area.modo == 4){
			
			double x1 = 200;
			double y1 = 400;
			
			double x2 = 200;
			double y2 = 400 + area.altura;
			
			double x3 = 200 + area.base;
			double y3 = 400 + area.altura;
			
			Polygon p = new Polygon();
			p.addPoint((int)x1, (int) y1);
			p.addPoint((int)x2, (int) y2);
			p.addPoint((int)x3, (int) y3);
			
			g.fillPolygon(p);
		}
		if ( area.modo == 5){
			double x1 = 200;
			double y1 = 400;
			
			double x2 = 200 + area.baseparallelogram;
			double y2 = 400 ;
			
			double x3 = x2 + area.heightparallelogram;
			double y3 = y2 + area.heightparallelogram;
			
			double x4 = 200 + area.heightparallelogram;
			double y4 = 400 + area.heightparallelogram;
			Polygon f = new Polygon();
			f.addPoint((int) x1, (int) y1);
			f.addPoint((int)x2, (int)y2);
			f.addPoint((int)x3, (int)y3);
			f.addPoint((int) x4,(int) y4);
			
			g.fillPolygon(f);
		}
		if (area.modo == 6){
			double x1 = 200;
			double y1 = 400;
			
			double x2 = 200 + area.toptrapezium;
			double y2 = 400;
			
			double x3 = x2 + area.heighttrapezium;
			double y3 = 400 + area.heighttrapezium;
			
			double x4 = 200 - area.heighttrapezium;
			double y4 = 400 + area.heighttrapezium;
			Polygon e = new Polygon();
			e.addPoint((int)x1, (int)y1);
			e.addPoint((int)x2, (int)y2);
			e.addPoint((int) x3, (int) y3);
			e.addPoint((int) x4, (int) y4);
			g.fillPolygon(e);
		}
		repaint();
	}
	

}
