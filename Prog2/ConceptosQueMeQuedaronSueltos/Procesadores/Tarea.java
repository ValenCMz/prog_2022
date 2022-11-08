package Procesadores;

public class Tarea {
	private double prioridad;
	private double usoDeMemoria;
	private double usoDeCpu;
	private String id;
	
	public Tarea(String id, double prioridad, double usoDeMemoria, double usoDeCpu) {
		this.prioridad = prioridad;
		this.usoDeMemoria = usoDeMemoria;
		this.usoDeCpu = usoDeCpu;
		this.id = id;
	}

	public double getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(double prioridad) {
		this.prioridad = prioridad;
	}

	public double getUsoDeMemoria() {
		return usoDeMemoria;
	}

	public void setUsoDeMemoria(double usoDeMemoria) {
		this.usoDeMemoria = usoDeMemoria;
	}

	public double getUsoDeCpu() {
		return usoDeCpu;
	}

	public void setUsoDeCpu(double usoDeCpu) {
		this.usoDeCpu = usoDeCpu;
	}
	
	public void ejecutarTarea() {
		System.out.println("Se ejecuto la tarea:" + this);
	}
	
	@Override
	public String toString() {
		return "Tarea("+this.id+"," + this.prioridad + ","+this.usoDeCpu+","+this.usoDeMemoria+")";
	}

}
