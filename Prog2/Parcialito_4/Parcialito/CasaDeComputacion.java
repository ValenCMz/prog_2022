package Parcialito;

import java.util.ArrayList;

import Parcialito.Filtros.Filtro;

public class CasaDeComputacion {
	private ArrayList<Producto>productos;
	private ArrayList<Cliente>clientes;
	private ArrayList<Proveedor>proveedores;
	private ArrayList<Empleado>empleados;
	
	public CasaDeComputacion() {
		this.productos = new ArrayList<Producto>();
		this.clientes = new ArrayList<Cliente>();
		this.proveedores = new ArrayList<Proveedor>();
		this.empleados = new ArrayList<Empleado>();
	}
	
	//El filtro se va a instanciar en el main y ahi se le pasa la condicion de busqueda
	public ArrayList<Producto> buscar(Filtro f){
		ArrayList<Producto> productosCumple = new ArrayList<>();
		for(Producto producto:productos) {
			if(f.cumple(producto)) {
				productosCumple.add(producto);
			}
		}
		return productosCumple;
	}
	
	//los demas add van a ser iguales, pero recibiran su objeto especifico
	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	
}
