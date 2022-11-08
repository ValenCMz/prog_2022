package Parcial_28_10_2021;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Parcial_28_10_2021.Filtros.Filtro;

public class PaqueteCompuesto extends Elemento{
	private ArrayList<Elemento>elementos;
	private Comparator<Elemento>orden;
	
	public PaqueteCompuesto(int id, int cant, Comparator<Elemento> orden) {
		super(id,cant);
		this.elementos = new ArrayList<>();
		this.orden = orden;
	}

	@Override
	public LocalDate getFechaPago() {
		LocalDate ultima = LocalDate.of(1900, 1, 1);
		for(Elemento e: elementos) {
			LocalDate aux = e.getFechaPago();
			if(aux==null) {
				return null;
			}
			else {
				if(aux.isAfter(ultima)) {
					ultima=aux;
				}
			}
		}
		return ultima;
	}
	

	@Override
	public String getCiudadOrigen() {
		String retornar=null;
		if(!elementos.isEmpty()) {
			retornar = this.elementos.get(0).getCiudadOrigen();
		}
		return retornar; 	
	}

	@Override
	public String getCiudadDestino() {
		return this.elementos.get(elementos.size()-1).getCiudadDestino();
	}

	@Override
	public int getCosto() {
		int sum=0;
		for(Elemento e:elementos) {
			sum+=e.getCosto();
		}
		return sum;
	}
	
	public void addPaquete(Elemento p) {
		if(this.verificarPasajeros(p)) {
			if(p.getCiudadOrigen().equals(elementos.get(elementos.size()-1).getCiudadDestino())) {
				this.elementos.add(p);
			}
			else if(elementos.isEmpty()) {
				this.elementos.add(0,p);
			}
		}
	}

	private boolean verificarPasajeros(Elemento p) {
		boolean coincide = true;
		int i = 0;
		while(coincide&&i<elementos.size()) {
			if(elementos.get(i).getCantPasajeros()!=p.getCantPasajeros()) {
				coincide = false;
			}
			i++;
		}
		return coincide;
	}
	
	public ArrayList<Elemento>buscar(Filtro f){
		ArrayList<Elemento>cumplen=new ArrayList<>();//puedo llamar al del padre y preguntar si esta vacio
		if(f.cumple(this)) {
			cumplen.add(this);
		}else {
			for(Elemento e:elementos) {
				cumplen.addAll(e.buscar(f));
			}
		}
		Collections.sort(cumplen,orden);
		return cumplen;
	}
	
	

}
