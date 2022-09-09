package Practico_2_series;

import java.util.ArrayList;

public class Series {
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList<Temporadas>temp;
	
	public Series(String titulo, String descripcion, String creador, String genero){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temp = new ArrayList<Temporadas>(); 
	}
	
	public void addTemporada(Temporadas t1) {
		this.temp.add(t1);
	}
	
	public int getCantidadEpisodiosVistos() {
		int cont = 0;
		for(int i = 0; i<temp.size();i++) {	
				cont += temp.get(i).getCantEpisodiosVistos();
		}
		return cont;
	}
	
	//Obtener el promedio de las calificaciones dadas para una serie.
	public double getPromedioCalificaciones() {
		double suma=0;
		double cont=0;
		for(int i = 0; i<temp.size();i++) {
			suma += temp.get(i).getPromedioCalificaciones();
			cont++;
		}
		return (suma / cont);
	}
////	● Determinar si se vio todos los episodios de la serie.
//	public boolean vioTodosLosEpisodio() {
//		
//		
//	}
}
