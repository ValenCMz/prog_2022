package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import SistemaDeArchivos.Filtros.Filtro;

public class Archivo extends Elemento{
	private int tamanioEnKb;

	
	public Archivo(String nombre,int tamanioEnKb, LocalDate fechaDeModificacion, LocalDate fechaDeCreacion) {
		super(nombre,fechaDeModificacion,fechaDeCreacion);
		this.tamanioEnKb = tamanioEnKb;
	}
	
	//retorna 1 o 0?
	public int getCantElementos() {
		return 0;
	}
	
	public int getTamanio() {
		return this.tamanioEnKb;
	}
	
	@Override
	public ArrayList<Elemento> buscar(Filtro filtro) {
		ArrayList<Elemento>elementos=new ArrayList<>();
		if(filtro.cumple(this)) {
			elementos.add(this);
		}
		return elementos;
	}
}

