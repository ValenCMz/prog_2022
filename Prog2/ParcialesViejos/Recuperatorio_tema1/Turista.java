package Recuperatorio_tema1;

public class Turista {
	private String nombre;
	private int edad;
	private String ciudadOrigen;
	
	public Turista(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudadOrigen = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	
}
