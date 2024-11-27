package control;

import logica.Figura;
import presentacion.PFormulario;
import presentacion.PLienzo;

public class Controlador {
	private Figura figura;
	private PFormulario pFormulario;
	
	
	public Controlador(PFormulario pFormulario) {
		this.pFormulario = pFormulario;
		this.figura = new Figura();
		this.figura.addObserver(this.pFormulario.getfFigura().getpLienzo());
		this.figura.addObserver(this.pFormulario.getfFigura().getpEstado());
	}

	public void insertarCuadrado(int r, int g, int b) throws Exception {
		this.figura.insertarCuadrado(r,g,b);
	}
	
	public void insertarCirculo(int r, int g, int b) throws Exception {
		this.figura.insertarCirculo(r,g,b);
	}
}
