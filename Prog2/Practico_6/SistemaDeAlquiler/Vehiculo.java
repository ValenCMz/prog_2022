package SistemaDeAlquiler;

public class Vehiculo extends Item{
	private String marca;
	private double km;
	private String patente;
	private boolean estaAlquilado;
	
	public Vehiculo(String nombre, String id, int fechaLimite, int fechaInicio, String marca, double km,
			String patente, boolean estaAlquilado) {
		super(nombre, id, fechaLimite, fechaInicio);
		this.marca = marca;
		this.km = km;
		this.patente = patente;
		this.estaAlquilado = estaAlquilado;
	}
	
	public boolean sePuedeAlquilar() {
		if(estaAlquilado!=true) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public void actualizar() {
		this.estaAlquilado = true;
	}
	
	
}
