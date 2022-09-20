package Practico_3_Juego_de_personajes;

public class Personaje {
	private String nombreReal;
	private String nombreSuper;
	private double visionNocturna;
	private double velocidad;
	private double fuerza;
	private double peso;
	private double altura;
	private double edad;
	
	public Personaje(String nombreReal, String nombreSuper, double visionNocturna, double velocidad, double fuerza,
			double peso, double altura, double edad) {
		this.nombreReal = nombreReal;
		this.nombreSuper = nombreSuper;
		this.visionNocturna = visionNocturna;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	public Personaje() {
		
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public String getNombreSuper() {
		return nombreSuper;
	}

	public double getVisionNocturna() {
		return visionNocturna;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public double getFuerza() {
		return fuerza;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double getEdad() {
		return edad;
	}
	
	

}
