package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import SistemaDeArchivos.Filtros.Filtro;

public class Directorio extends Elemento{
	private ArrayList<Elemento>elementos;

	public Directorio(String nombre,LocalDate fechaDeModificacion, LocalDate fechaDeCreacion) {
		super(nombre,fechaDeModificacion,fechaDeCreacion);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e1) {
		this.elementos.add(e1);
	}
	
	public int getCantElementos() {
		int contador = this.elementos.size(); //consultar en la practica, porque no poner 0?
		for(Elemento elemento:elementos) {
			contador+=elemento.getCantElementos();	
		}
		return contador;
	}
	
	public int getTamanio() {
		int sum = 0;
		for(Elemento elemento:elementos) {
			sum+=elemento.getTamanio();
		}
		return sum;
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
