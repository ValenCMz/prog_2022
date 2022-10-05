package CongresoDeCienciasDeLaComputacion;

import java.util.ArrayList;

public class Congreso {

	private String nombre;
	private ArrayList<Evaluador> evaluadores;
	private ArrayList<Trabajo> trabajosPresentados;
	
	public Congreso(String nombre) {
		this.nombre = nombre;
		this.evaluadores = new ArrayList<Evaluador>();
		this.trabajosPresentados = new ArrayList<Trabajo>();
	}
	
	
//	 qué evaluador puede asignarse a un determinado trabajo,
	public Evaluador evaluadorPuedeAsignarseATrabajo(Trabajo trabajo) {
		int i = 0;
		boolean esApto = false;
		Evaluador evaluadorApto = null;
		while(i<evaluadores.size()&& !esApto) {	
				//seria evaluadoreEsApto o trabajoEsApto?
			if(evaluadores.get(i).evaluadorEsApto(trabajo)) {//se le pregunta al evaluador si es apto para el trabajo
				esApto=true;
				evaluadorApto=evaluadores.get(i);
			}
		}
		return evaluadorApto;
	}
	
	
//	qué trabajos pueden asignarse un evaluador particular
	public ArrayList<Trabajo> trabajosQuePuedenAsignarseAEvaluador(Evaluador evaluador){
		ArrayList<Trabajo>trabajosQueCumplen = new ArrayList<>();
		for(Trabajo trabajo:trabajosPresentados) {
			if(trabajo.evaluadorEsApto(evaluador)) {
				trabajosQueCumplen.add(trabajo);
			}
		}
		
		if(trabajosQueCumplen.size()!=0) {
			return trabajosQueCumplen;
		}
		else {
			return null;
		}
	}
	
	public int trabajosPorEvaluador(Evaluador evaluador) {
		return evaluador.getCantTrabajos();
	}
	
	public void addEvaluador(Evaluador evaluador) {
		this.evaluadores.add(evaluador);
	}
	
	public void addTrabajoPresentado(Trabajo trabajo) {
		this.trabajosPresentados.add(trabajo);
	}

}
