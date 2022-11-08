package Procesadores;

public class ProcesadorPorGpu extends Procesador{

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoDeMemoria()>t2.getUsoDeMemoria();
	}
	
	
	
}
