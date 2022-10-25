package Navidad;

import java.util.ArrayList;

import Navidad.Filtros.Filtro;

public class Buzon extends Correo{
	private ArrayList<Niño>niniosBuenos;
	private ArrayList<Carta>cartas;
	
	public Buzon() {
		this.niniosBuenos = new ArrayList<>();
		this.cartas = new ArrayList<>();
	}

	public void addCarta(Carta carta) {
		if(esNinioBueno(carta.getNinio())) {
			cartas.add(carta);
		}
		else {
			carta.vaciarLista();//se vacia y agrega carbon a su lista de regalos
			cartas.add(carta);
		}
	}
	
	public boolean esNinioBueno(Niño ninio) {
		return niniosBuenos.contains(ninio);
	}
	
	public ArrayList<Carta>buscar(Filtro f1){
		ArrayList<Carta>cartasCumple = new ArrayList<>();
		for(Carta carta:cartas) {
			if(f1.cumple(carta)) {
				cartasCumple.add(carta);
			}
		}
		return cartasCumple;
	}
	
	//1
	public double porcCartasQuePidenRegalo(Filtro f1) {
		double cont = this.buscar(f1).size();
		return cont/cartas.size()*100;
	}
	
	//2. Dado un buzón, provincia o país, conocer la cantidad de cartas recibidas que piden un
		//determinado regalo.
	@Override
	public double cantCartasQuePidenRegalo(Filtro filtro) {
		return this.buscar(filtro).size();
	}
	
	//3. Dado un buzón, provincia o país, conocer la cantidad de niños malos que enviaron
	//una carta
	@Override
	public double cantNiniosMalos() {
		double cont = 0;
		for(Carta carta:cartas) {
			if(carta.perteneceANinioMalo()) {
				cont++;
			}
		}
		return cont;
	}
	
	@Override
	public double cantTotalDeCartasRecibidas() {
		return this.cartas.size();
	}
	
	
	
	
	
	
	
	
	
}
