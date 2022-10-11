package CentroDeComputos;

import java.util.ArrayList;

public class Proceso extends ColaDeEspera{
	private String nombre;
	private double requrimientoDeMemoria;
	
	public Proceso(String nombre, double requrimientoDeMemoria) {
		super();
		this.nombre = nombre;
		this.requrimientoDeMemoria = requrimientoDeMemoria;
	}
	
	
	@Override
	public void ordenar(ArrayList<Proceso>procesos) {
		for(Proceso proceso : procesos) {
			if(this.getRequrimientoDeMemoria() > (proceso.getRequrimientoDeMemoria())) {
				procesos.
			}
		}
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRequrimientoDeMemoria() {
		return requrimientoDeMemoria;
	}

	public void setRequrimientoDeMemoria(double requrimientoDeMemoria) {
		this.requrimientoDeMemoria = requrimientoDeMemoria;
	}




	
}
