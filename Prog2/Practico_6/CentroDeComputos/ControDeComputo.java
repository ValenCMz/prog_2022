package CentroDeComputos;

import java.util.ArrayList;

public class ControDeComputo {
	private ColaDeEspera cola;
	private ArrayList<Proceso>procesos;
	private ArrayList<Computadora>computadorasDisponibles;
	
	public ControDeComputo(ColaDeEspera cola) {
		this.procesos = new ArrayList<Proceso>();
		this.computadorasDisponibles = new ArrayList<Computadora>();
		this.cola = cola;
	}
	
	public void ejecutarProcesos(Proceso proceso) {
		if(this.computadorasDisponibles.size()==0) {
			cola.ordenar(this.procesos);
		}
	}
	
}
