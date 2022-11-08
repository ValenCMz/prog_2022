package Parcial_28_10_2021.Comportamientos;

import java.time.LocalDate;
import java.util.Comparator;

import Parcial_28_10_2021.Elemento;

public class ComparadorFecha implements Comparator<Elemento>{

	@Override
	public int compare(Elemento o1, Elemento o2) {
		LocalDate f1 = o1.getFechaPago();
		LocalDate f2 = o2.getFechaPago();
		
		if(f1!=null) {
			return f1.compareTo(f2);
		}
		//para q los null vayan a lo ultimo
		return -1;
	}

}
