package SistemaElectoral.Filtros;

import SistemaElectoral.Voto;

public abstract class Filtro {
	public abstract boolean cumple(Voto v);
}
