package Futbol5;

import java.util.ArrayList;

public class Socio {
	private String nombre, apellido;
	private int edad;
	private boolean pago;//si es true es porque pago la ultima cuota
	private ArrayList<AlquilerDeCancha>alquileresRealizados;
	
	public Socio(String nombre, String apellido, int edad, boolean pago) {
		this.nombre= nombre;
		this.apellido = apellido;
		this.pago = pago;
		this.alquileresRealizados = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public void addAlquilerDeCancha(AlquilerDeCancha cancha) {
		if(!this.alquileresRealizados.contains(cancha)) {
			this.alquileresRealizados.add(cancha);
		}
	}
	
	public boolean alquiloCancha(int idBuscado) {
		boolean alquilo = false;
		int i =0;
		while(!alquilo&&i<this.alquileresRealizados.size()) {
			if(alquileresRealizados.get(i).getIdCancha()==(idBuscado)) {
				alquilo=true;
			}
		}
		return alquilo;
	}
	
	public int getCantAlquileres(int idBuscado) {
		int cont=0;
		for(AlquilerDeCancha alquiler:alquileresRealizados) {
			if(alquiler.getIdCancha()==idBuscado) {
				cont++;
			}
		}
		return cont;
	}
	
	public boolean esMayor(int min) {
		boolean supero = false;
		int i =0;
		while(!supero&&i<this.alquileresRealizados.size()) {
			if(alquileresRealizados.get(i).getPrecio()>(min)) {
				supero=true;
			}
		}
		return supero;
	}
	
}
