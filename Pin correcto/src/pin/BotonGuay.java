package pin;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class BotonGuay extends JButton{

	private Color color;
	private Color colorActivado = new Color(255,0,0,128);
	private boolean activado=false;

	public BotonGuay(String string, Color color) {
		super(string);
		this.color=color;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		if(activado){
			g.setColor(colorActivado);
		}else{
			g.setColor(color);
		}
		g.fillRect(0, 0, 200, 200);
	}

	public void setColor(Color color2) {
		this.color=color2;
	}

	public boolean activado() {
		return activado;
	}

	public void activar() {
		activado = true;

	}
	public void desActivar() {
		activado = false;

	}

}
