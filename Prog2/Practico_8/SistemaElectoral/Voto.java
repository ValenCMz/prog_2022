package SistemaElectoral;

import java.time.LocalTime;

public class Voto {
	private Persona votante;
	private Persona candidatoVotado;//si es null es xq esta en blanco
	private LocalTime horaEmitida;
	
	public Persona getVotante() {
		return this.votante;
	}
	
	public Persona getCandidatoVotado() {
		return this.candidatoVotado;
	}
	
	public boolean esBlanco() {
		return this.candidatoVotado==null;
	}
	
	public LocalTime getHoraEmitida() {
		return this.horaEmitida;
	}
}
