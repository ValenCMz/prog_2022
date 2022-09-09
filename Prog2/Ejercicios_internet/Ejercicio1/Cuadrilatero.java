package Ejercicio1;

public class Cuadrilatero {
	private float lado1;
	private float lado2;
	
	public Cuadrilatero(float lado1, float lado2) {
		if(lado1==lado2) {
			new Cuadrilatero(lado1);
		}else {
			this.lado1 = lado1;
			this.lado2 =lado2;
		}
		
	}
	
	//si es un cuadrado
	public Cuadrilatero(float lado1) {
		this.lado1 = lado1;
		this.lado2 = lado1;
	}
	
	public float getPerimeto() {
		return 2*(this.lado1+this.lado2);
	}
	
	public float getArea() {
		return this.lado1 * this.lado2;
	}

}
