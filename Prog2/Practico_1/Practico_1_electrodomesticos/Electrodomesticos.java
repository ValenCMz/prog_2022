package Practico_1_electrodomesticos;
//2 Electrodomésticos
//Crear una clase Electrodoméstico con las siguientes características:
//Atributos son nombre, precio base, color, consumo energético y peso.

//Valores por defecto:
//● El color por defecto es gris plata.
//● El consumo energético 10 Kw.
//● Precio base 100 pesos.
//● El peso es 2 kg.

//Implementar todos los constructores.

//La funcionalidad de la clase es la siguiente:
//● Todos los métodos get y set.
//● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
//● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
//● Indicar si un producto es de alta gama, el balance es mayor que 3
public class Electrodomesticos {
	final static int MAXCONSUMO = 45;
	final static int MINBALANCE = 3;
	
	
	private String nombre;
	private double precio;
	private String color;
	private int consumoEnergetico;
	private double peso;
	
	//CONSTRUCTORES
	public Electrodomesticos(String nombre, double precio, String color ,int consumoEnergetico, double peso){
		 this.nombre = nombre;
		 this.precio = precio;
		 this.color = color;
		 this.consumoEnergetico = consumoEnergetico;
		 this.peso = peso;
	}
	
	public Electrodomesticos(String nombre) {
		this(nombre, 100, "gris plata", 10, 2);
	}
	
	public Electrodomesticos(String nombre, double precio) {
		this(nombre, precio, "gris plata", 10, 2);
	}
	
	public Electrodomesticos(String nombre, double precio, String color) {
		this(nombre, precio, color, 10, 2);
	}	
	
	public Electrodomesticos(String nombre, double precio, String color ,int consumoEnergetico) {
		this(nombre, precio, color, consumoEnergetico, 2);
	}

	//GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
	public boolean esBajoConsumo(){
		if(getConsumoEnergetico()<MAXCONSUMO) 
			return true;
		else
			return false;
	}
	//● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
	public double calculoBalance() {
		return getPrecio()/getPeso();
	}
	
	//● Indicar si un producto es de alta gama, el balance es mayor que 3
	public boolean altaGama() {
		if(calculoBalance()>MINBALANCE) 
			return true;
		else
			return false;
	}


}
