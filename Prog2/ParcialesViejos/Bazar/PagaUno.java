package Bazar;

import Bazar.Filtros.Filtro;

public class PagaUno extends Combo {

	public PagaUno(double tope, double descuento, Filtro filtro) {
		super(tope, descuento, filtro);
	}

	public double getPrecio() {
		double sum = 0;//6
		for(Elemento e:elementos) {
			double precioElemento = e.getPrecio();//15
			if(sum<precioElemento) {//5>6 //5<6 // 6<15
				sum=precioElemento;
			}
		}
		return sum;
	}

}
