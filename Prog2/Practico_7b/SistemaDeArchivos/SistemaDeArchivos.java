package SistemaDeArchivos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaDeArchivos.Filtros.Filtro;

public class SistemaDeArchivos {
	private ArrayList<Elemento>elementos;
	private Comparator<Elemento> comparador;
	
	public SistemaDeArchivos() {
		this.elementos = new ArrayList<>();
		this.comparador = comparador;
	}
	
	public void setComparador(Comparator<Elemento>comparador) {
		this.comparador = comparador;
	}
	
//	Un archivo comprimido será incluido en el resultado de la búsqueda,
//		si alguno de los elementos que contiene en su interior cumple con el criterio de la
//		búsqueda (se agrega el archivo comprimido al resultado, pero no los elementos que contiene).
	
	public ArrayList<Elemento> buscarOrdenado(Filtro filtro){
		ArrayList<Elemento>elementoCumple=new ArrayList<>();
		for(Elemento e:elementos) {
			elementoCumple.addAll(e.buscar(filtro));
		}
		Collections.sort(elementoCumple,comparador);
		return elementoCumple;
	}
	
//	Un link cumple con el criterio de búsqueda por sí mismo, sin tener en cuenta el elemento que
//	apunta.
	

//	ascendentemente por fecha de creación y luego por nombre, ordenados descendentemente por
//	tamaño, luego por fecha de creación y finalmente por nombre descendente, entre otros
//	posibles criterios de ordenamiento.

	
}
