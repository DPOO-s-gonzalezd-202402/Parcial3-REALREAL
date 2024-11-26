package presentacion;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PEstado extends JPanel implements Observer {
	private JLabel lCantidad;
	
	public PEstado() {
		this.lCantidad = new JLabel("0 nodos");
		this.setLayout(new FlowLayout());
		this.add(this.lCantidad);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		ArrayList<Integer> ids = (ArrayList<Integer>)arg;
		this.lCantidad.setText(ids.size() + (ids.size()==1?" nodo":" nodos"));
	}
	
	
	
}
