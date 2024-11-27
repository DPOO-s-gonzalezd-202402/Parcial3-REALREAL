package presentacion;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class FFigura extends JFrame {
	private PFormulario pFormulario;
	private PLienzo pLienzo;
	private PEstado pEstado;
	
	public PLienzo getpLienzo() {
		return pLienzo;
	}

	public PEstado getpEstado() {
		return pEstado;
	}

	public FFigura() throws HeadlessException {
		this.setTitle("Parcial Sara Catalina González :D");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		this.pLienzo = new PLienzo();
		this.pEstado = new PEstado();
		this.pFormulario = new PFormulario(this);
		
		this.add(this.pFormulario, BorderLayout.WEST);
		this.add(this.pLienzo, BorderLayout.CENTER);
		this.add(this.pEstado, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FFigura();
	}
}
