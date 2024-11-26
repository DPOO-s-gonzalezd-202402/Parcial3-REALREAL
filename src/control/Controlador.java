package control;

import logica.ListaDoble;
import presentacion.PFormulario;
import presentacion.PLienzo;

public class Controlador {
	private ListaDoble listaDoble;
	private PFormulario pFormulario;
	
	
	public Controlador(PFormulario pFormulario) {
		this.pFormulario = pFormulario;
		this.listaDoble = new ListaDoble();
		this.listaDoble.addObserver(this.pFormulario.getfListaDoble().getpLienzo());
		this.listaDoble.addObserver(this.pFormulario.getfListaDoble().getpEstado());
	}

	public void insertar(int id, String nombre, String apellido) throws Exception {
		this.listaDoble.insertarNodo(id, nombre, apellido);
	}
}
