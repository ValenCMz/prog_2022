package PrefinalSoftware;

import java.util.ArrayList;

public abstract class ElementoEmpleado implements Comparable<ElementoEmpleado>{
	private String nombre;
	private String apellido;
	private int edad;
	
	public ElementoEmpleado(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public abstract double getSueldo(Programador p);
	public abstract ArrayList<String>getEspecialidades();
	public abstract ArrayList<ElementoEmpleado>getEmpleados();
	public abstract int getCantEmpleados();

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
	
	@Override
	public int compareTo(ElementoEmpleado o) {
		int res = o.getApellido().compareTo(this.getApellido());
		if(res==0) {
			res = o.getNombre().compareTo(this.getNombre());
		}
		return res;
	}
	
	
}
