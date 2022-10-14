package CentroDeComputos;

import java.util.ArrayList;

public class ControDeComputo {
	private ColaDeEspera colaProcesos;
	private ColaDeEspera colaComputadoras;
	
	public ControDeComputo(ColaDeEspera colaProcesos, ColaDeEspera colaComputadoras) {
		this.colaProcesos = colaProcesos;
		this.colaComputadoras = colaComputadoras;
	}
	
//	Si no hay computadoras disponibles los procesos a ejecutar deben
//	esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
//	memoria
	public void addComputadora(Computadora pc) {
		if(pc==null ) {
			return;
		}
		if(colaProcesos.tieneElementos()) {
			Proceso proceso = (Proceso) colaProcesos.obtener();
			pc.ejecutarProceso(proceso);
		}
		else {
			colaComputadoras.addElemento(pc);
		}
	}
	
	public void addProceso(Proceso p) {
		if(p==null)return;
		if(colaComputadoras.tieneElementos()) {
			Computadora computadora = (Computadora) colaComputadoras.obtener();
			computadora.ejecutarProceso(p);
		}
		else {
			colaProcesos.addElemento(p);
		}
	}
	
}
