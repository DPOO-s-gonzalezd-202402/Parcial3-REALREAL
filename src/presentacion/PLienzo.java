package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PLienzo extends JPanel implements Observer {
	private int[] figurin;
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		if (this.figurin[0]==0) {
			//como es o hago cuadrado
			g2d.setColor(new Color(figurin[1], figurin[2], figurin[3]));
			g2d.fillRect(50, 50, 150, 150);
			
		}else {
			//acá ya se que es circulo
			g2d.setColor(new Color(figurin[1], figurin[2], figurin[3]));
			g2d.fillOval(50, 50 , 200, 200);
		}

	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.figurin = (int[])arg;
		this.repaint();
	}

}
