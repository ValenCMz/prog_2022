package Recuperatorio_tema1.Filtros;

import Recuperatorio_tema1.Habitacion;

public class FiltroMascota extends Filtro{

	public boolean cumple(Habitacion h) {
		return h.isAceptanMascotas();
	};

}
