package Ejercicio2;

public class Tablero {
	private double x;
	private double y;
	
	
	public Tablero(double x, double y) {
		this.x = x;
		this.y = y; 	
	}
	
	public void movIzq() {
		y = y-1;
		System.out.println("movimiento izq");
	}
	public void movDer() {
		y = y+1;
		System.out.println("movimiento Der");
	}
	public void movAbajo() {
		x = y-1;
		System.out.println("movimiento Abajo");
	}
	public void movArriba() {
		y = y+1;
		System.out.println("movimiento Arriba");
	}

}
