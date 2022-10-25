package SistemaDeArchivos.Comparadores;

import java.util.Comparator;

import SistemaDeArchivos.Elemento;

public class ComparadorNot implements Comparator<Elemento>{
	private Comparator<Elemento>comp;
	
	public ComparadorNot(Comparator<Elemento>comp) {
		this.comp = comp;
	}
	
	public int compare(Elemento o1, Elemento o2) {
		return comp.compare(o1, o2) * -1;
	}
	
}
