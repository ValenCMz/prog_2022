package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorPorNombre implements Comparator<Socio>{
	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}
