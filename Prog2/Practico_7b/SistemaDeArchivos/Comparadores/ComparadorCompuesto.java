package SistemaDeArchivos.Comparadores;

import java.util.Comparator;

import SistemaDeArchivos.Elemento;

public class ComparadorCompuesto implements Comparator<Elemento>{
	private Comparator<Elemento>comp1;
	private Comparator<Elemento>comp2;
	
	public ComparadorCompuesto(Comparator<Elemento>comp1,Comparator<Elemento>comp2) {
		this.comp1=comp1;
		this.comp2=comp2;
	}
	
	public int compare(Elemento e1, Elemento e2) {
		int res = comp1.compare(e1, e2);
		if(res==0) {
			res = comp2.compare(e1, e2);
		}
		return res;
	}
}
