package Practico_3_Sistemas_De_Encuestas;

public class Persona {
	private String nombre;
	private int dni;
	
	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni ;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public boolean equals(Object obj) {
		Persona p = ((Persona)obj);
		if(p.getDni()== this.getDni()) {
			return true;
		}
		return false;
	}
	
}
