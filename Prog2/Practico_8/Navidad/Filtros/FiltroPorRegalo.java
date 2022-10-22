package Navidad.Filtros;

import Navidad.Carta;

public class FiltroPorRegalo extends Filtro{
	
	private String regaloBuscado;
	
	public FiltroPorRegalo(String regaloBuscado) {
		this.regaloBuscado = regaloBuscado;
	}
	
	public boolean cumple(Carta c) {
		return c.tieneRegalo(regaloBuscado);
	}
}
