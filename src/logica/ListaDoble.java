package logica;

import java.util.ArrayList;
import java.util.Observable;

public class ListaDoble extends Observable {
	private Nodo raiz;
	
	public ListaDoble() {
		this.raiz = null;
	}
	
	public void insertarNodo(int id, String nombre, String apellido) throws Exception {
		if(existeNodo(id)) {
			throw new Exception("Ya existe");
		}else {
			Nodo nuevoNodo = new Nodo(id, nombre, apellido);
			 if (raiz == null) {
				 this.raiz = nuevoNodo;
			 } else {
				 Nodo nodoAux = this.raiz;
				 while(nodoAux.getSig() != null) {
					 nodoAux = nodoAux.getSig();
				 } 
				 nodoAux.setSig(nuevoNodo);
				 nuevoNodo.setAnt(nodoAux);
			 }
			 recorrerLista();
		}
	}
	
	public void recorrerLista() {
		ArrayList<Integer> ids = new ArrayList<Integer>();
		Nodo nodoAux = this.raiz;
		while (nodoAux.getSig() != null) {
			ids.add(nodoAux.getPersona().getId());
			nodoAux = nodoAux.getSig();
		}
		ids.add(nodoAux.getPersona().getId());
		notificar(ids);
	}

	private void notificar(ArrayList<Integer> ids) {
		this.setChanged();
		this.notifyObservers(ids);
	}
	
	private boolean existeNodo(int id) {
		Nodo nodoAux = this.raiz;
		while (nodoAux != null) {
			if(nodoAux.getPersona().getId() == id) {
				return true;
			}
			nodoAux = nodoAux.getSig();
		}
		return false;
	}
	
	
	
}
