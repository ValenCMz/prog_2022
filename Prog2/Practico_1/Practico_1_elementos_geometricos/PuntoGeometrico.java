package Practico_1_elementos_geometricos;
//Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
//El valor por defecto de los mismos es (0,0)

//La funcionalidad que posee la clase es la siguiente:
//● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
//del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
//(cierto desplazamiento en X y cierto desplazamiento en Y).
//● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
//euclídea con otro punto acorde a la siguiente formula:
//Distancia^2 = ( X1 – X2 )^2 + (Y1 – Y2)^2

//La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
//cuadrada. 
public class PuntoGeometrico {

	private double x;
	private double y;
	
	//CONSTRUCTORES EN ESTE CASO CON ESTE CONSTRUCTOR, ALCANZA
	public PuntoGeometrico(){
		this.x = 0;
		this.y = 0;
	}
	
	//GET y SET
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void desplazarPunto(double despX, double despY) {
		this.x += despX;
		this.y += despY;
	}
	
	//● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
	//euclídea con otro punto acorde a la siguiente formula:
	//Distancia^2 = ( X1 – X2 )^2 + (Y1 – Y2)^2
	
	public double CalcdisEuclidea(PuntoGeometrico otroPunto) {
		double dist2 = Math.pow((this.getY() - otroPunto.getX()),2) + Math.pow((this.getY() - otroPunto.getY()),2);
		return Math.sqrt(dist2);
	}
	
	
	
	
	
}
