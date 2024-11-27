package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Controlador;

public class PFormulario extends JPanel {
	private JTextField r;
	private JTextField g;
	private JTextField b;
	private JButton bCuadrado;
	private JButton bCirculo;
	private Controlador controlador;
	private FFigura fFigura;
	
	public FFigura getfFigura() {
		return fFigura;
	}

	public PFormulario(FFigura fFigura) {
		this.fFigura = fFigura;
		this.r = new JTextField();
		this.g = new JTextField();
		this.b = new JTextField();
		this.bCuadrado = new JButton("Cuadrado");
		this.bCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertarCuadrado();
				
			}
		});
		this.bCirculo = new JButton("Circulo");
		this.bCirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertarCirculo();
				
			}
		});
		
		this.controlador = new Controlador(this);
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.add(new JLabel("R"));
		this.add(this.r);
		this.add(new JLabel("G"));
		this.add(this.g);
		this.add(new JLabel("B"));
		this.add(this.b);
		this.add(this.bCuadrado);
		this.add(this.bCirculo);
		
		
	}

	public void insertarCuadrado() {
		try {
			this.controlador.insertarCuadrado(Integer.parseInt(this.r.getText()), Integer.parseInt(this.g.getText()), Integer.parseInt(this.b.getText()));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this.fFigura, "Los canales de color son numéricos entre 0 y 255", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.fFigura, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void insertarCirculo() {
		try {
			this.controlador.insertarCirculo(Integer.parseInt(this.r.getText()), Integer.parseInt(this.g.getText()), Integer.parseInt(this.b.getText()));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this.fFigura, "Los canales de color son numéricos entre 0 y 255", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.fFigura, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
