package Bazar;

import java.util.ArrayList;

import Bazar.Filtros.Filtro;

public class Producto extends Elemento{
	private ArrayList<String>categorias;
	private double peso;
	private double precio;
	
	public Producto(double peso, double precio) {
		this.peso = peso;
		this.precio = precio;
	}
	
	public void addCategorias(String cat) {
		if(!categorias.contains(cat)) {
			categorias.add(cat);
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public ArrayList<String>getCategorias(){
		return new ArrayList<>(this.categorias);
	}
	
	public int getCantProductos() {
		return 1;
	}
	
	@Override
	public Producto getProductoMenorPeso() {
		return this;
	}
	
	public boolean tieneCategoria(String cat) {
		return categorias.contains(cat);
	}
	
	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento>producto = new ArrayList<>();
		if(f.cumple(this)) {
			producto.add(this);
		}
		return producto;
	}
	
	@Override
	public Elemento copiar(Filtro f) {
		Producto copia = null;
		if(f.cumple(this)) {
			copia = new Producto(this.peso,this.precio);
			for(String s : categorias) {
				copia.addCategorias(s);
			}
		}
		return copia;
	}
	

}
