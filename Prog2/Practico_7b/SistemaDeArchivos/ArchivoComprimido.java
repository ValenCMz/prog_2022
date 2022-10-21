package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import SistemaDeArchivos.Filtros.Filtro;

public class ArchivoComprimido extends Directorio{
	private ArrayList<Elemento>elementos;

	public ArchivoComprimido(String nombre, ArrayList<Elemento> elementos,LocalDate fechaDeModificacion, LocalDate fechaDeCreacion) {
		super(nombre, fechaDeModificacion, fechaDeCreacion);
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
	
	public ArrayList<Elemento> buscar(Filtro filtro){
		ArrayList<Elemento>elementosCumple=new ArrayList<>();
		boolean cumple=false;
		int i = 0;
		while(!cumple&&i<this.elementos.size()) {
			if(filtro.cumple(elementos.get(i))) {
				cumple=true;
			i++;
			}
		}
		
		if(cumple) {
			elementosCumple.add(this);
		}
	
		return elementosCumple;
	}
}
