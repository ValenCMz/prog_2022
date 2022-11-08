package Recuperatorio_tema1.Filtros;

import Recuperatorio_tema1.Habitacion;

public class FiltroPorCaract extends Filtro{
	private String caract;
	
	public FiltroPorCaract(String caract) {
		this.caract = caract;
	}

	public boolean cumple(Habitacion h) {
		return h.tieneCaract(caract);
	};
}
