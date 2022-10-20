package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroPorId extends Filtro{
	private int idBuscado;
	
	public FiltroPorId(int idBuscado) {
		this.idBuscado = idBuscado;
	}
	
	public boolean cumple(Socio socio) {
		return socio.alquiloCancha(idBuscado);
	}
}
