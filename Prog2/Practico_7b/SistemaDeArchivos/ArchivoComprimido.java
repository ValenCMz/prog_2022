package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivoComprimido extends Elemento{
	private ArrayList<Elemento>elementos;

	public ArchivoComprimido(String nombre, ArrayList<Elemento> elementos) {
		super(nombre);
		this.elementos = elementos;
	}
	
	public int getCantElementos() {
		int contador=0;
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
