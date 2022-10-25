package SistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaElectoral.Filtros.Filtro;

public class Mesa extends Establecimiento{
	private ArrayList<Persona>padron;
	private ArrayList<Voto>votos;
	
	public Mesa() {
		this.padron= new ArrayList<>();
		this.votos = new ArrayList<>();
	}
	
	public void addVoto(Voto voto) {
		if(estaEnElPadron(voto.getVotante())) {
			this.votos.add(voto);
		}
	}
	
	public boolean estaEnElPadron(Persona persona) {
		return this.padron.contains(persona);
	}
	
	public ArrayList<Voto> buscar(Filtro f1){
		ArrayList<Voto>votosCumplen = new ArrayList<>();
		for(Voto voto:votos) {
			if(f1.cumple(voto)) {
				votosCumplen.add(voto);
			}
		}
		return votosCumplen;
	}
	
	//literal son iguales los de porc, los podre juntar?

	@Override
	public double getPorcDeVotosPorCandidato(Filtro f1) {
		double res=this.buscar(f1).size();
		return res/this.votos.size()*100;
	}
	
	@Override
	public double getPorcDeVotosEnBlanco(Filtro f1) {
		double res = this.buscar(f1).size();
		return res/this.votos.size()*100;
	}
	
	@Override
	public double getPorcDeVotosEntreHorarios(Filtro f1) {
		double res = this.buscar(f1).size();
		return res/this.votos.size()*100;
	}
	
	@Override
	public double getCantidadDeVotosEmitidos() {
		return this.votos.size();
	}
	
	
//	Obtener un listado de todos los candidatos que se presentan a la elección, ordenado
//	por partido político si son del mismo partido ordenarlos por agrupación; y si son de la
//	misma agrupación ordenarlos por nombre
	public ArrayList<Candidato> obtenerCandidatos(Comparator<Candidato>comp){
		ArrayList<Candidato> candidatos = new ArrayList<>();
		for(Voto voto : votos) {
			if(!candidatos.contains(voto.getCandidatoVotado())) {
				candidatos.add((Candidato)voto.getCandidatoVotado());
			}
		}
		Collections.sort(candidatos, comp);
		return candidatos;
	}
	
}
