package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorNombreVulgar extends Filtro{
	private String nombreVulgarBuscado;
	
	public FiltroPorNombreVulgar(String nombreVulgarBuscado) {
		this.nombreVulgarBuscado = nombreVulgarBuscado;
	}
	
	public boolean cumple(Planta planta) {
		return planta.tieneNombreVulgar(nombreVulgarBuscado);
	}
}
