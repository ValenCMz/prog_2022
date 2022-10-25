package SistemaElectoral.Comparadores;

import java.util.Comparator;

import SistemaElectoral.Candidato;

public class ComparadorPorPartidoPolitico implements Comparator<Candidato>{
	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getPartidoPolitico().compareTo(o2.getPartidoPolitico());
	}
}
