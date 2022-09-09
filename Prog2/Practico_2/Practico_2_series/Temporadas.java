package Practico_2_series;

import java.util.ArrayList;

public class Temporadas {
	private ArrayList<Episodios>episodio;
	
	public Temporadas() {
		this.episodio = new ArrayList<Episodios>();
	}
	
	public void addEpisodio(Episodios e1) {
		this.episodio.add(e1);
	}
	
	public int getCantEpisodios() {
		return episodio.size();
	}
	
	public int getCantEpisodiosVistos() {
		int cont = 0;
		for(int i = 0; i<episodio.size();i++) {
			if(episodio.get(i).isFlag() == true) {
				cont++;
			}
		}
		return cont;
	}
	
	//Obtener el promedio de las calificaciones dadas para una temporada particular.
	public double getPromedioCalificaciones() {//POR AHI HAY Q VERIFICAR Q EL EPISODIO ESTE VISTO O TENGA CLASIFICACION
		double suma = 0;
		for(int i= 0; i<episodio.size();i++) {
			if(episodio.get(i).isFlag()) {
				suma += episodio.get(i).getClasificacion();
			}
		}
		return suma/this.getCantEpisodiosVistos();
	}
	
//	public double cantTemporadas() {
//		double cont=0;
//		
//		
//		return cont;
//	}
}
