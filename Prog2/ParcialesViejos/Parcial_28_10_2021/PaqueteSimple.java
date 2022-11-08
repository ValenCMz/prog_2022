package Parcial_28_10_2021;

import java.time.LocalDate;
import java.util.ArrayList;

import Parcial_28_10_2021.Filtros.Filtro;

public class PaqueteSimple extends Elemento{
	private String datosAlojamiento;
	private String ciudadOrigen;
	private String ciudadDestino;
	private LocalDate fechaPago;
	private int costo;
	
	
	public PaqueteSimple(String datosAlojamiento, String ciudadOrigen, String ciudadDestino, LocalDate fechaDePago,
			int costo, int cantPasajeros,int id) {
		super(id,cantPasajeros);
		this.datosAlojamiento = datosAlojamiento;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaPago = null;
		this.costo = costo;
	}

	public String getDatosAlojamiento() {
		return datosAlojamiento;
	}

	public void setDatosAlojamiento(String datosAlojamiento) {
		this.datosAlojamiento = datosAlojamiento;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaDePago) {
		this.fechaPago = fechaDePago;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	public ArrayList<Elemento>buscar(Filtro f){
		ArrayList<Elemento>cumplen=new ArrayList<>();
		if(f.cumple(this)) {
			cumplen.add(this);
		}
		return cumplen;
	}

	
	

	

}
