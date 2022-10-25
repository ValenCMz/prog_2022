package Vivero.Filtros;

import Vivero.Planta;

public class FiltroIncluyaNombre extends Filtro	{
	private String nombreCientificoBuscado;
	
	public FiltroIncluyaNombre(String nombreCientificoBuscado) {
		this.nombreCientificoBuscado = nombreCientificoBuscado;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getNombreCientifico().contains(nombreCientificoBuscado);
	}
}
