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
		g2d.setColor(new Color(0, 0, 255));
		if (this.figurin[0]==0) {
			//como es o hago cuadrado
			g2d.setColor(new Color(figurin[1], figurin[2], figurin[3]));
			g2d.fillRect(50, 50, 100, 100);
			
		}else {
			//acá ya se que es circulo
			g2d.setColor(new Color(figurin[1], figurin[2], figurin[3]));
			g2d.fillOval(50, 50 , 20, 20);
		}
//		if(this.ids != null) {
//			g2d.setColor(new Color(0, 0, 255));
//			for(int i=0; i<this.ids.size(); i++) {
//				g2d.drawRect(30 + (120*i), 30, 90, 30);
//				g2d.drawLine(60 + (120*i), 30, 60 + (120*i), 60);
//				g2d.drawLine(90 + (120*i), 30, 90 + (120*i), 60);
//				g2d.drawString(String.valueOf(this.ids.get(i)), 60 + 15 - 8 + (120*i), 45 + 4);
//				if(i == 0) {
//					g2d.drawLine(30, 30, 60, 60);
//				}else {
//					g2d.drawLine(120 + (120*(i-1)), 50, 165 + (120*(i-1)), 50);
//					g2d.drawString("<", 120 + (120*(i-1)), 50 + 4);
//					g2d.fillOval(165 - 4 + (120*(i-1)), 50 - 4, 8, 8);
//				}
//				if(i == this.ids.size()-1) {
//					g2d.drawLine(90 + (120*i), 30, 120 + (120*i), 60);
//				}else {
//					g2d.drawLine(105 + (120*i), 40, 150 + (120*i), 40);
//					g2d.drawString(">", 150 - 8 + (120*i), 40 + 4);
//					g2d.fillOval(105 - 4 + (120*i), 40 - 4, 8, 8);
//
//				}
//
//			}
			
			
			
//		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.figurin = (int[])arg;
		this.repaint();
	}

}
