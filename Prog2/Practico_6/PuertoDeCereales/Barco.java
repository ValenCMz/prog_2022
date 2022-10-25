package PuertoDeCereales;

import java.time.LocalDate;

public class Barco extends Elemento{
	private Camion camion;
	public Barco(String nombre, int identificacion, int capacidad, LocalDate fechaDeCarga) {
		super(nombre, identificacion, capacidad, fechaDeCarga);
	}
	
	//reedefinicion del metodo abstracto en Elemento
	public boolean tienePrioridad(Elemento elemento) {
		//los de mayor capacidad van primero
			//el elemento que llega tiene q ser mayor al this
		return elemento.getCapacidad() > this.getCapacidad();
	}
	
	public void descargar(Camion camion) {
		this.camion = camion;
	}
}
