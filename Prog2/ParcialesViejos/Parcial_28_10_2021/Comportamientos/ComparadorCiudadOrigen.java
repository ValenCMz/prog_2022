package Parcial_28_10_2021.Comportamientos;

import java.util.Comparator;

import Parcial_28_10_2021.Elemento;

public class ComparadorCiudadOrigen implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getCiudadOrigen().compareTo(o2.getCiudadOrigen());
	}

}
