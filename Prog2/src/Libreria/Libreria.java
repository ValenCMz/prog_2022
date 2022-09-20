package Libreria;

import java.util.ArrayList;

public class Libreria {
	private ArrayList<Producto>productos;
	private ArrayList<Cliente>clientes;
	
	
	public Libreria() {
		this.productos = new ArrayList<Producto>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public double getPrecio(Producto p, Cliente c) {
		return p.getPrecio(c);
	}
	
	public boolean comproProducto(Cliente cl, Producto pp) {
		return cl.comprasteProducto(pp);
	}
	
	public boolean leGustaLibro(Cliente cl, Libro l1) {
		return cl.leGusta(l1);
	}
}
