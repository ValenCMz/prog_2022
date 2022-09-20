package Libreria;

public class ComportamientoGenero extends Comportamiento {

	public ComportamientoGenero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean leGusta(Libro l1, Cliente c1) {
		return c1.leGustaGenero(l1.getGenerLiterario());
	}

}
