package Navidad;

import java.util.ArrayList;

import Navidad.Filtros.Filtro;

public class Barrio extends Correo{
	private ArrayList<Correo>buzones;
	
	public Barrio() {
		this.buzones = new ArrayList<>();
	}
	
	//1
	@Override
	public double porcCartasQuePidenRegalo(Filtro filtro) {
		double cont = 0;
		for(Correo buzon:buzones) {
			cont += buzon.porcCartasQuePidenRegalo(filtro);
		}
		return cont;
	}
	
	@Override
	public double cantCartasQuePidenRegalo(Filtro filtro) {
		double cont = 0;
		for(Correo buzon:buzones) {
			cont += buzon.cantCartasQuePidenRegalo(filtro);
		}
		return cont;
	}
	
	//3. Dado un buzón, provincia o país, conocer la cantidad de niños malos que enviaron
	//una carta
	
	@Override
	public double cantNiniosMalos() {
		double cont = 0;
		for(Correo buzon:buzones) {
			cont+= buzon.cantNiniosMalos();
		}
		return cont;	
	}
	
	@Override
	public double cantTotalDeCartasRecibidas() {
		double cont=0;
		for(Correo buzon:buzones) {
			cont+= buzon.cantTotalDeCartasRecibidas();
		}
		return cont;
	}
}
