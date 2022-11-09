package Bazar;

import java.util.ArrayList;

import Bazar.Filtros.Filtro;


public class Combo extends Elemento{
	private double tope;
	private double descuentoPorProducto;
	protected ArrayList<Elemento>elementos;
	private Filtro filtro;

	public Combo(double tope, double descuento, Filtro filtro) {
		this.tope = tope;
		this.descuentoPorProducto = descuento;
		this.elementos = new ArrayList<>();
		this.filtro = filtro;
	}
	
	public double getPrecio() {
		double sum = 0.0;
		for(Elemento e:elementos) {
			sum+=e.getPrecio();
		}
		double descuento = this.descuentoPorProducto * this.getCantProductos();
		if(descuento>tope) {
			descuento=tope;
		}
		return sum -descuento*sum;
	}
	
	public double getPeso() {
		double sum = 0.0;
		for(Elemento e:elementos) {
			sum+=e.getPeso();
		}
		return sum;
		}
	
	public ArrayList<String>getCategorias(){
		ArrayList<String>res = new ArrayList<>();
		for(Elemento e:elementos) {
			ArrayList<String>aux = e.getCategorias();
			for(String s:aux) {
				if(!res.contains(s)) {
					res.add(s);
				}
			}
		}
		return res;
	}
	
	public void addElemento(Elemento nuevo)
	{
		if(filtro.cumple(nuevo)) {
			elementos.add(nuevo);
		}
	}
	
	public int getCantProductos() {
		int sum = 0;
		for(Elemento e:elementos) {
			sum+=e.getCantProductos();
		}
		return sum;
	}

	public Producto getProductoMenorPeso() {
		Producto aux = null;
		double menorPeso = Double.MAX_VALUE;
		for(Elemento e: elementos) {
			Producto productoMenorPeso = e.getProductoMenorPeso();
			double temp = e.getPeso();
			if(productoMenorPeso==null || temp<menorPeso) {
				menorPeso = temp;
				aux = productoMenorPeso;
			}
		}
		return aux;
	}
	
	@Override
	public boolean tieneCategoria(String categoriaBuscada) {
		return this.getCategorias().contains(categoriaBuscada);
	}
	
	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		ArrayList<Elemento>cumplen = new ArrayList<>();
		if(f.cumple(this)) {
			cumplen.add(this);
		}else {
			for(Elemento e:elementos) {
				cumplen.addAll(e.buscar(f));
			}
		}
		return cumplen;
	}

	@Override
	public Elemento copiar(Filtro f) {
		Combo comboCopia =  new Combo(this.tope,this.descuentoPorProducto,this.filtro);
			for(Elemento e : elementos) {			
				Elemento copia = e.copiar(f);//delego la copia
				if(copia!=null) {
					comboCopia.addElemento(copia);				}
				}
			if(comboCopia.estaVacio()) {
				return null;
			}
		return comboCopia;
	}
	
	public boolean estaVacio() {
		return this.elementos.isEmpty();
	}

}
