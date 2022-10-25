package SistemaElectoral.Filtros;

import SistemaElectoral.Candidato;
import SistemaElectoral.Voto;

public class FiltroPorCandidato extends Filtro{
	private Candidato candidato;
	
	public FiltroPorCandidato(Candidato candidato) {
		this.candidato= candidato;
	}
	
	public boolean cumple(Voto voto) {
		return voto.getCandidatoVotado().equals(candidato);
	}
}
