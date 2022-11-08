package Procesadores;

public class ProcesadorCpu extends Procesador{

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getUsoDeCpu()>t2.getUsoDeCpu();
	}
	
}
