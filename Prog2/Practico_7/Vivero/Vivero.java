package Vivero;

import java.util.ArrayList;

import Vivero.Filtros.Filtro;

public class Vivero {
	private ArrayList<Planta>plantas;
	
	public Vivero() {
		this.plantas = new ArrayList<>();
	}
	
	public ArrayList<Planta> buscar(Filtro filtro){
		ArrayList<Planta>plantasCumple = new ArrayList<>();
		for(Planta planta:plantas) {
			if(filtro.cumple(planta)) {
				plantasCumple.add(planta);
			}
		}
		return plantasCumple;
	}
	
}
