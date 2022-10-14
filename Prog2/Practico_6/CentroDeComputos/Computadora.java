package CentroDeComputos;

public class Computadora extends Elemento{
	private double velocidadDeProcesamiento;
	private Proceso proceso;

	public Computadora(String nombre, double velocidadDeProcesamiento) {
		super(nombre);
		this.velocidadDeProcesamiento = velocidadDeProcesamiento;
	}
	
	public double getVelocidadDeProcesamiento() {
		return this.velocidadDeProcesamiento;
	}
	
	public boolean esMayor(Elemento elemento) {
		return this.getVelocidadDeProcesamiento() >  ((Computadora) elemento).getVelocidadDeProcesamiento();
	}
	
	public void ejecutarProceso(Proceso p) {
		this.proceso =p;
	}
	
}
