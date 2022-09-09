package Practico_3_Fabrica_De_Muebles;

public class Producto {
	private String nombreMueble;
	private double peso;
	private double costo;
	private double valor;
	private String tipoDeMadera;
	private String color;
	static final double porcentaje = 35;
	
	public Producto(String nombreMueble,double peso,double costo, String tipoDeMadera, String color) {
		this.nombreMueble = nombreMueble;
		this.peso = peso;
		this.costo = costo;
		this.tipoDeMadera = tipoDeMadera;
		this.color = color;
		this.valor = 0;
	}

	public double getCosto() {
		return this.costo;
	}
	
	public String getNombreMueble() {
		return nombreMueble;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public double getPrecioVenta() {
		this.valor	= this.getCosto() + (this.getCosto()*porcentaje)/100;//Regla de 3
		return this.valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Producto temp = (Producto)obj;
			return this.getNombreMueble().equals(temp.getNombreMueble());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public String toString() {
		return this.getNombreMueble();
	}

}
