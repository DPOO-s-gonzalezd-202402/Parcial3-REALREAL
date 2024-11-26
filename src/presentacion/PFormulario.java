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
	private JTextField tId;
	private JTextField tNombre;
	private JTextField tApellido;
	private JButton bInsertar;
	private Controlador controlador;
	private FListaDoble fListaDoble;
	
	public FListaDoble getfListaDoble() {
		return fListaDoble;
	}

	public PFormulario(FListaDoble fListaDoble) {
		this.fListaDoble = fListaDoble;
		this.tId = new JTextField();
		this.tNombre = new JTextField();
		this.tApellido = new JTextField();
		this.bInsertar = new JButton("Insertar");
		this.bInsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertar();
				
			}
		});
		this.controlador = new Controlador(this);
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.add(new JLabel("Id"));
		this.add(this.tId);
		this.add(new JLabel("Nombre"));
		this.add(this.tNombre);
		this.add(new JLabel("Apellido"));
		this.add(this.tApellido);
		this.add(this.bInsertar);
		
		
	}

	public void insertar() {
		try {
			this.controlador.insertar(Integer.parseInt(this.tId.getText()), this.tNombre.getText(), this.tApellido.getText());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this.fListaDoble, "El id es numerico", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this.fListaDoble, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
}
