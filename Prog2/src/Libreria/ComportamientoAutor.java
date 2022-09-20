package Libreria;

public class ComportamientoAutor extends Comportamiento {

	//LE PIDE EL AUTOR AL LIBRO Y LE PREGUNTA AL CLIENTE SI LE GUSTA ESE AUTOR
	@Override
	public boolean leGusta(Libro l1, Cliente c1) {
		return c1.leGustaAutor(l1.getAutor());
	}

}
