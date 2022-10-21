package SistemaDeArchivos.Comparadores;

import java.util.Comparator;

import SistemaDeArchivos.Elemento;

public class ComparadorPorNombre implements Comparator<Elemento>{
	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}
