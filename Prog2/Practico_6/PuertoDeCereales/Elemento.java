package PuertoDeCereales;

import java.time.LocalDate;

public abstract class Elemento {
	private String nombre;
	private int identificacion;//alguna forma de identificar el elemento
	private int capacidad;//en kg
	private LocalDate fechaDeCarga;
	
	public Elemento(String nombre, int identificacion, int capacidad, LocalDate fechaDeCarga) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.capacidad = capacidad;
		this.fechaDeCarga = fechaDeCarga;
	}
	
	//funcion abstracta que tengo q definir aun
	public abstract boolean tienePrioridad(Elemento elemento);

	public String getNombre() {
		return nombre;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public LocalDate getFechaDeCarga() {
		return fechaDeCarga;
	}
	
	
}
