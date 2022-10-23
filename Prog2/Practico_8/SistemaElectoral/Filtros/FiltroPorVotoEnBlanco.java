package SistemaElectoral.Filtros;

import SistemaElectoral.Voto;

public class FiltroPorVotoEnBlanco extends Filtro{
	
	public boolean cumple(Voto voto) {
		return voto.esBlanco();
	}
}
