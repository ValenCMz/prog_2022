package Libreria;

public abstract class Comportamiento {
	//DELEGAMOS LA RESPONSABILIDAD DE DECIDIR SI A UN CLIENTE LE GUSTA UN LIBRO
	public abstract boolean leGusta(Libro l1, Cliente c1);

}
