package Libreria;

public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, long dni, String direccion) {
		super(nombre, apellido, dni, direccion);
	}

	public boolean leGusta(Libro l1) {
		if(super.leGusta(l1)) {
			return generosFavoritos.contains(l1.getGenerLiterario());
		}else {
			return false;
		}
	}
}
