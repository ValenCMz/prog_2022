package Recuperatorio_tema1;

import java.time.LocalDate;
import java.util.ArrayList;

import Recuperatorio_tema1.Filtros.Filtro;


public class Habitacion extends Elemento{
	private int metros2;
	private int cantCamas;
	private LocalDate fechaUltOcupamiento;
	private boolean aceptanMascotas;
	private ArrayList<String>comodidades;
	private Turista turista;
	
	public Habitacion(int metros2, int cantCamas, LocalDate fechaUltOcupamiento, boolean aceptanMascotas, Turista turista) {
		super();
		this.metros2 = metros2;
		this.cantCamas = cantCamas;
		this.fechaUltOcupamiento = fechaUltOcupamiento;
		this.aceptanMascotas = aceptanMascotas;
		this.comodidades = new ArrayList<>();
		this.turista = turista;
	}
	
	
	@Override
	public int getMestrosCuadrados() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public ArrayList<Habitacion>buscar(Filtro f){
		ArrayList<Habitacion>habitaciones = new ArrayList<>();
		if(this.turista==null) {
			if(f.cumple(this)) {
				habitaciones.add(this);
			}
		}
		return habitaciones;
	}
	
	public boolean tieneCaract(String caract) {
		return this.comodidades.contains(caract);
	}


	public int getMetros2() {
		return metros2;
	}


	public void setMetros2(int metros2) {
		this.metros2 = metros2;
	}


	public int getCantCamas() {
		return cantCamas;
	}


	public void setCantCamas(int cantCamas) {
		this.cantCamas = cantCamas;
	}


	public LocalDate getFechaUltOcupamiento() {
		return fechaUltOcupamiento;
	}


	public void setFechaUltOcupamiento(LocalDate fechaUltOcupamiento) {
		this.fechaUltOcupamiento = fechaUltOcupamiento;
	}


	public boolean isAceptanMascotas() {
		return aceptanMascotas;
	}


	public void setAceptanMascotas(boolean aceptanMascotas) {
		this.aceptanMascotas = aceptanMascotas;
	}


	public Turista getTurista() {
		return turista;
	}


	public void setTurista(Turista turista) {
		this.turista = turista;
	}
	
	
	

}
