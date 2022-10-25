package Futbol5.Comparadores;

import java.util.Comparator;

import Futbol5.Socio;

public class ComparadorCompuesto implements Comparator<Socio>{
	private Comparator<Socio>com1;
	private Comparator<Socio>com2;

	public ComparadorCompuesto(Comparator<Socio> com1, Comparator<Socio> com2){
		this.com1 = com1;
		this.com2 = com2;
	}
	
	@Override
	public int compare(Socio o1, Socio o2) {
		int res = com1.compare(o1, o2);
		if(res==0) {
			return com2.compare(o1, o2);
		}
		return res;	
	}

}
