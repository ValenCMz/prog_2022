package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorPorCantidadAlquileres implements Comparator<Socio>{
	private int idBuscado;
	
	public ComparadorPorCantidadAlquileres(int idBuscado) {
		this.idBuscado = idBuscado;
	}
	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getCantAlquileres(idBuscado)-o2.getCantAlquileres(idBuscado);
	}
}
