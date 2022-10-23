package SistemaElectoral.Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class ComparadorPorAgrupacion implements Comparator<Candidato>{
	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getAgrupacion().compareTo(o2.getAgrupacion());
	}
}
