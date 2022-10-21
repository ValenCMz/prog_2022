package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import SistemaDeArchivos.Filtros.Filtro;

public class Link extends Elemento{
	private static int TAMANIO = 1;//kb
	
	public static void setTamanio(int tam) {
		TAMANIO = tam;
	}
	
	private Elemento referencia;

	public Link(String nombre, Elemento referencia,LocalDate fechaDeModificacion, LocalDate fechaDeCreacion) {
		super(nombre,fechaDeModificacion,fechaDeCreacion);
		this.referencia = referencia;
	}
	
	public int getCantElementos() {
		return 0;
	}
	
	public int getTamanio() {
		return TAMANIO;//en kb
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
