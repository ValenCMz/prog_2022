package Parcial_28_10_2021;

import java.time.LocalDate;
import java.util.ArrayList;

import Parcial_28_10_2021.Filtros.Filtro;

public abstract class Elemento {
	private int id;
	private int cantPasajeros;
	
	public Elemento(int id, int cantPasajeros) {
		this.id = id;
		this.cantPasajeros = cantPasajeros;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}
	
	public abstract LocalDate getFechaPago();
	public abstract String getCiudadOrigen();
	public abstract String getCiudadDestino();
	public abstract int getCosto();
	public abstract ArrayList<Elemento> buscar(Filtro f);

	

}
