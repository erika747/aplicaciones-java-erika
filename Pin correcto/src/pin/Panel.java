package pin;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	private BufferedImage img;

	public Panel(){
		try {
			img = ImageIO.read(new File("imagen de arduino.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g){
		
		g.drawImage(img, 0, 0, null);
		super.paintChildren(g);
	}
}
