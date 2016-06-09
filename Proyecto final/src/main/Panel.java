package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {
	private float[] x = new float []{150, 172, 194, 194, 216, 238, 150, 172, 194, 216, 238, 260, 260, 282, 282, 304, 304, 326, 326, 348, 348, 370, 370, 392, 392, 414, 436, 414, 150, 172, 194, 216, 216, 238, 150, 172, 194, 260, 282, 304, 238, 260, 282, 304, 326, 348, 370, 392, 414, 392, 414, 150, 172, 194, 150, 172, 194, 216, 238, 216, 238, 260, 260, 282, 150, 172, 194, 150, 172, 194, 216, 216, 238, 238, 260 ,260, 282, 304, 150, 172, 194, 150 ,172, 194, 216, 216, 238, 238};
	private float[] y = new float []{200, 200, 200, 178, 178, 178, 222, 222, 222, 200, 200, 200, 178, 178, 200, 178, 200, 200, 222, 200, 222, 200, 222, 200, 222, 200, 200, 222, 244, 244, 244, 244, 222, 222, 266, 266, 266, 222, 222, 222, 244, 244, 244, 244, 244, 244, 244, 244, 244, 266, 266, 288, 288, 288, 310, 310, 310, 266, 266, 288, 288, 266, 288, 266, 332, 332, 332, 354, 354, 354, 310, 332, 310, 332, 310, 332, 332, 332, 376, 376, 376, 398, 398, 398, 354, 376, 354, 376};
	private int height = 20;
	private int width = 20;
	@Override
	public void paint (Graphics g){
		super.paint(g);
		
		for(int i = 0;i<y.length;i++){
			if(i < 28){
				g.setColor(Color.RED);
			}
			if ( i > 27 && i < y.length){
				g.setColor(new Color(255, 110, 0));
			}
			if (i > 50 && i< y.length){
				g.setColor(Color.YELLOW);
			}
			if (i > 63 && i < y.length){
				g.setColor(Color.GREEN);
			}
			if ( i > 77 && i < y.length){
				g.setColor(new Color(70, 180, 255));
			}
			g.fillRect((int)x[i], (int) y[i], width, height);
		}
		
		
		
		
	}
}
