package RegistroEmpresa.PersonaAsociada;

public class PersonaAsociada {
	private String cargoDeLaPersona;
	private String nombre;
	private String apellido;
	private int edad;
	
	public PersonaAsociada(String cargoDeLaPersona, String nombre, String apellido, int edad) {
		this.cargoDeLaPersona = cargoDeLaPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getCargoDeLaPersona() {
		return cargoDeLaPersona;
	}

	public void setCargoDeLaPersona(String cargoDeLaPersona) {
		this.cargoDeLaPersona = cargoDeLaPersona;
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
	
	

	
}
