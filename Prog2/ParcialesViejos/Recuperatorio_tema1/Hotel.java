package Recuperatorio_tema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Recuperatorio_tema1.Habitacion;
import Recuperatorio_tema1.Filtros.Filtro;

public class Hotel extends Elemento{
	private ArrayList<Elemento>elementos;
	private Comparator<Habitacion>orden;
	
	public Hotel(Comparator<Habitacion>orden) {
		this.elementos = new ArrayList<>();
		this.orden = orden;
	}

	@Override
	public int getMestrosCuadrados() {
		int sum = 0;
		for(Elemento e:elementos)
			sum += e.getMestrosCuadrados();
		return sum;
	}
	
	public ArrayList<Habitacion>buscar(Filtro f){//Preguntar si el orden llega por parametro y por constructor
		ArrayList<Habitacion>habitaciones = new ArrayList<>();
		for(Elemento e: elementos) {
			habitaciones.addAll(e.buscar(f));
		}
		Collections.sort(habitaciones,orden);
		return habitaciones;
	}
	
	public int getCantHabitaciones(Filtro f) {
		ArrayList<Habitacion>habitaciones=this.buscar(f);
		return habitaciones.size();
	}
	

	

}
