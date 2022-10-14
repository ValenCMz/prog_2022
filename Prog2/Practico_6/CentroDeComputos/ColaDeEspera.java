package CentroDeComputos;

import java.util.ArrayList;

public class ColaDeEspera {
	private ArrayList<Elemento>elementos;
	
	//agregar un elemento a la cola
	public void addElemento(Elemento elemento) {
		boolean seAgrego = false;
		int i = 0;
		while(!seAgrego && i<elementos.size()) {
			//si el elemento nuevo es mayor al que esta en la cola, lo inserto
			if(elemento.esMayor(elementos.get(i))) {
				elementos.add(i, elemento);
				seAgrego = true;
			}
			i++;
		}
		//si no se inserto en ninguna posicion, lo agrego al final
		if(!seAgrego) {
			elementos.add(elemento);
		}
	}
	
	public boolean tieneElementos() {
		return elementos.isEmpty();
	}
	
	//eliminar
	
	//obtener la primer posicion del elemento
	public Elemento obtener() {
		//tener en cuenta
		if(!elementos.isEmpty())
			return this.elementos.remove(0);
		else
			return null;
	}
}
