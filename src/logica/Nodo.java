package logica;

public class Nodo {
	private Persona persona;
	private Nodo sig;
	private Nodo ant;
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	public Nodo getAnt() {
		return ant;
	}
	public void setAnt(Nodo ant) {
		this.ant = ant;
	}
	
	public Nodo(int id, String nombre, String apellido) {
		this.persona = new Persona(id, nombre, apellido);
		this.ant = null;
		this.sig = null;
	}
	
	
}
