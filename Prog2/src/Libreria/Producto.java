package Libreria;

public class Producto {
	private String nombre;
	private String autor;
	private double precio;
		
	public Producto(String nombre, String autor, double precio) {
		this.nombre = nombre ;
		this.autor = autor;
		this.precio = precio;	
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public double getPrecio(Cliente comprador) {
		
		if(comprador!=null) {
			return precio - (comprador.getDescuento()/100)	* precio;
		}
		else {
			return precio;

		}
		
	}
	
	//@Override
	public boolean equals(Object obj) {
		try {
			Producto p1 = (Producto)obj;
			return p1.getNombre().equals(nombre) && p1.getAutor().equals(autor);
		}catch(Exception e) {
			return false;
		}
	}
	
	

}
