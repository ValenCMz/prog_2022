package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorClasificacion extends Filtro{
	private String clasificacionBuscada;
	
	public FiltroPorClasificacion(String clasificacionBuscada) {
		this.clasificacionBuscada = clasificacionBuscada;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getClasificacionSuperior().equals(clasificacionBuscada);
	}
}
