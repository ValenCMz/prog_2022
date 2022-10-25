package Futbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Futbol5.Filtros.Filtro;

public class ClubFutbol5 {
	private ArrayList<Socio>socios;//los socioes que tiene el club
	private ArrayList<AlquilerDeCancha>alquileresDeCanchas;
	private Comparator<Socio>comparador;
	
	public ClubFutbol5(){
		this.socios = new ArrayList<>();
		this.alquileresDeCanchas = new ArrayList<>();
	}
	
	public void setComparador(Comparator<Socio>comparador) {
		this.comparador = comparador;
	}
	
	public ArrayList<Socio> buscar(Filtro f1){
		ArrayList<Socio>sociosCumple=new ArrayList<>();
		for(Socio socio:socios) {
			if(f1.cumple(socio)) {
				sociosCumple.add(socio);
			}
		}
		Collections.sort(sociosCumple, this.comparador);//lo ordeno de alguna manera, depende como quiera el user
		return sociosCumple;
	}
}
