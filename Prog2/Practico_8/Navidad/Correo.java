package Navidad;

import Navidad.Filtros.Filtro;

public abstract class Correo {
	public abstract double porcCartasQuePidenRegalo(Filtro filtro);
	//2. Dado un buzón, provincia o país, conocer la cantidad de cartas recibidas que piden un
	//determinado regalo.
	public abstract double cantCartasQuePidenRegalo(Filtro filtro);
	//3. Dado un buzón, provincia o país, conocer la cantidad de niños malos que enviaron
	//una carta
	public abstract double cantNiniosMalos();
	//Dado un buzón, provincia o país, conocer la cantidad de total de cartas recibidas.
	public abstract double cantTotalDeCartasRecibidas();
}
