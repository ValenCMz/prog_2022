package SistemaDeArchivos.Comparadores;

import java.util.Comparator;

import SistemaDeArchivos.Elemento;

public class ComparadorPorTamanio implements Comparator<Elemento> {
	public int compare(Elemento o1, Elemento o2) {
		return o1.getTamanio()-o2.getTamanio();
	}
}
