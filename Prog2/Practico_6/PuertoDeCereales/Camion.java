package PuertoDeCereales;

import java.time.LocalDate;

public class Camion extends Elemento{

	public Camion(String nombre, int identificacion, int capacidad, LocalDate fechaDeCarga) {
		super(nombre, identificacion, capacidad, fechaDeCarga);
	}

	//reedefinicion del metodo abstracto de Elemento
	public boolean tienePrioridad(Elemento elemento) {
		//los camiones que fueron cargados primero seran atendidos en primer lugar
		return elemento.getFechaDeCarga().isAfter(this.getFechaDeCarga());
	}
}
