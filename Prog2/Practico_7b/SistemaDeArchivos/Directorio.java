package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Elemento{
	private ArrayList<Elemento>elementos;

	public Directorio(String nombre, LocalDate fechaDeCreacion, ArrayList<Elemento> elementos) {
		super(nombre, fechaDeCreacion);
		this.elementos = elementos;
	}
	
	public int getCantElementos() {
		int contador=0; //consultar en la practica
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
	
}
