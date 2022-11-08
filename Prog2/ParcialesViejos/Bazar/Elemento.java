package Bazar;

import java.util.ArrayList;

import Bazar.Filtros.Filtro;

public abstract class Elemento {
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<String>getCategorias();
	public abstract int getCantProductos();
	public abstract Producto getProductoMenorPeso();
	public abstract boolean tieneCategoria(String categoriaBuscada);
	public abstract ArrayList<Elemento>buscar(Filtro f);
	public abstract Elemento copiar(Filtro f);
}
