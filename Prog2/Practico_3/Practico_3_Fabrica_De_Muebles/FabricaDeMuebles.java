package Practico_3_Fabrica_De_Muebles;

import java.util.ArrayList;

public class FabricaDeMuebles {
	private ArrayList<Producto>productos;
	private ArrayList<Producto>productosStock;
	
	
	public FabricaDeMuebles() {
		this.productos = new ArrayList<>();
		this.productosStock = new ArrayList<>();
	}
	

	//Le devuelvo una copia de los productos (esto para no romper encapsulamiento)
	public ArrayList<Producto> getProductos(){
		return new ArrayList<Producto>(productos);
	}
	
	public ArrayList<Producto> getProductosEnStock(){
		return new ArrayList<Producto>(productosStock);
	}
	
	public double getPrecioVenta(String producto) {
		double valor=0;
		for(int i = 0; i<productosStock.size();i++) {
			Producto p = productosStock.get(i);
			if(p.getNombreMueble().equals(producto)) {
				valor=p.getPrecioVenta();
			}
		}
		return valor;
	}
	
//	public double getCosto() {
//		return p.getCosto();
//	}
	
	public void addProducto(Producto p) {
		if(!productos.contains(p)) {
			this.productos.add(p);
		}
	}
	
	public void addProductoEnStock(Producto p) {
		if(!productosStock.contains(p)) {
			this.productosStock.add(p);
		}
			
	}
	
}
