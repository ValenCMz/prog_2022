package CandyCrush;

import java.util.ArrayList;

import CandyCrush.Filtros.Filtro;

public class Tablero {
	private int puntajeMinimo;//necesario para pasar al sig nivel
	private ArrayList<Ficha>fichas;
	
	public Tablero(int puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
		this.fichas = new ArrayList<>();
	}
	
	//calDificultad= sum de la fortaleza de las fichas/ sum del poder de destruccion
	public int calcDificultad() {
		return this.getSumFortaleza()/this.getSumPoderDeDestruccion();
	}
	
	public int getSumFortaleza() {
		int sum = 0;
		for(Ficha ficha:fichas) {
			sum += ficha.getFortaleza();
		}
		return sum;
	}
	
	public int getSumPoderDeDestruccion() {
		int sum = 0;
		for(Ficha ficha:fichas) {
			sum += ficha.getPoderDeDestruccion();
		}
		return sum;
	}
	
	public ArrayList<Ficha> buscar(Filtro f1){
		ArrayList<Ficha>fichasCumple = new ArrayList<>();
		
		for(Ficha ficha:fichas) {
			if(f1.cumple(ficha)) {
				fichasCumple.add(ficha);
			}
		}
		return fichasCumple;
	}
}
