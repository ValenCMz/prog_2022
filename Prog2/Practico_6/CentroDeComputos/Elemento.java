package CentroDeComputos;

public abstract class Elemento {
	private String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract boolean esMayor(Elemento elemento);
}
