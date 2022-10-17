package PuertoDeCereales;

import java.util.ArrayList;

public class ColaDeEspera {
	private ArrayList<Elemento>elementos;
	
	//agregar un elemento a la cola
	public void addElemento(Elemento elemento) {
		if(elemento==null)return;//si elemento es null, corto aca no mas
		
		boolean seAgrego = false;
		int i =0;
		
		while(!seAgrego && i<elementos.size()) {
			//el elemento que llega tiene prioridad sobre el que esta en el array?
				//si tiene lo agrego en esa posicion
			if(elemento.tienePrioridad(elementos.get(i))) {
				elementos.add(i, elemento);
				seAgrego = true;
			}
			i++;
		}
		
		if(!seAgrego) {
			elementos.add(elemento);
		}
	}
	
	//obtener un elemento de la cola
	public Elemento siguienteElemento() {
		if(!estaVacia()) {
			return elementos.remove(0);
		}
		else {
			return null;
		}
	}
	
	//esta vacia o no?
	public boolean estaVacia() {
		return elementos.isEmpty();
	}
	
}
