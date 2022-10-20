package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorPorEdad implements Comparator<Socio>{
	
	public int compare(Socio o1, Socio o2) {
		return o1.getEdad()-(o2.getEdad());
	}
}
