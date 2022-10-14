package Avicola;

import java.util.ArrayList;

public class EmpresaAvicola {
	private ArrayList<Producto>productos;
	
	public EmpresaAvicola() {
		this.productos = new ArrayList<>();
	}
	
	public void addProducto(Producto p1) {
		productos.add(p1);
	}
	
	public ArrayList<Producto> getProductos() {
		return new ArrayList<Producto>(productos);
	}
	
	public void getEtiquetaDeUnProducto(Producto p1) {
		System.out.println("Etiqueta de: " + p1.getNombre() + "\n" + p1);
	}
}
