package logica;


import java.util.ArrayList;
import java.util.Observable;

public class Figura extends Observable{

	public Figura() {
		super();
	}
	
	public void insertarCuadrado(int r, int g , int b) {
		int[] respuesta={0,r,g,b};
		this.setChanged();
		this.notifyObservers(respuesta);
	}
	
	public void insertarCirculo(int r, int g , int b) {
		int[] respuesta={1,r,g,b};
		this.setChanged();
		this.notifyObservers(respuesta);
	}
}
