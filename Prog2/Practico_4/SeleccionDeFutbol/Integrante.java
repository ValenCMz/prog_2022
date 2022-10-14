package SeleccionDeFutbol;

import java.time.LocalDate;

public abstract class Integrante {
	private String nombre;
	private String apellido;
	private int nroPasaporte;
	private LocalDate fechaNacimiento;
	private String estado;
	
	public Integrante(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroPasaporte = nroPasaporte;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
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

	public void setApellido(String apellido) {this.apellido = apellido;}
	
	public int getNroPasaporte() {return nroPasaporte;}

	public void setNroPasaporte(int nroPasaporte) {
		this.nroPasaporte = nroPasaporte;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Integrante i = (Integrante)obj;
			return this.getNroPasaporte() == (i.getNroPasaporte());
		}catch(Exception e) {
			return false;
		}
	}
	
}
