package Procesadores;

import java.util.ArrayList;

public abstract class Procesador {
	protected ArrayList<Tarea>tareas;
	
	public Procesador() {
		this.tareas = new ArrayList<>();
	}
	
	public abstract boolean esMayor(Tarea t1, Tarea t2);
	
	public void ordenar(Tarea t1) {
		boolean encontro=false;
		int i = 0;
		while(!encontro && i<tareas.size()) {
			if(this.esMayor(t1, tareas.get(i))) {
				encontro=true;
				tareas.add(i,t1);
			}
			i++;
		}
		
		if(!encontro) {
			tareas.add(t1);
		}
	}
	

}
