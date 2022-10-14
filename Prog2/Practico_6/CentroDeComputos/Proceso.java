package CentroDeComputos;

import java.util.ArrayList;

public class Proceso extends Elemento{
	private double requrimientoDeMemoria;
	
	public Proceso(String nombre, double requrimientoDeMemoria) {
		super(nombre);
		this.requrimientoDeMemoria = requrimientoDeMemoria;
	}
	
	public double getRequrimientoDeMemoria() {
		return requrimientoDeMemoria;
	}

	public void setRequrimientoDeMemoria(double requrimientoDeMemoria) {
		this.requrimientoDeMemoria = requrimientoDeMemoria;
	}


//	(los procesos con mayor requerimiento de memoria serán atendidos en primer lugar)
	public boolean esMayor(Elemento elemento) {
		return this.getRequrimientoDeMemoria() > ((Proceso) elemento).getRequrimientoDeMemoria();
	}


	
}
