package FacturacionDeEmplados;

public class Empleado {
	private String nombre, apellido;
	private long dni;
	private double sueldoMensual;
	
	public Empleado(String nombre,String apellido, long dni, double sueldoMensual ) {
		this.apellido= apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoMensual = sueldoMensual;
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

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	
}
