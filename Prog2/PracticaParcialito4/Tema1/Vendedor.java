package Tema1;

import java.time.LocalDate;
import java.util.ArrayList;
					//implemnto Comparable para los filtros, ya q no va a cmabiar en tiempo de ejecucion
public class Vendedor implements Comparable<Vendedor>{
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<ProductoVendido>productosVendidos;
	
	public Vendedor(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.productosVendidos = new ArrayList<>();
	}
	
	public void addProductos(ProductoVendido p) {
		this.productosVendidos.add(p);
	}
	
	public int cantVentasTotales(LocalDate inicio, LocalDate fin) {
		int ventasTotales = 0;
		for(ProductoVendido venta : productosVendidos) {
			if(venta.getFechaDeVenta().compareTo(inicio)>0 &&
				venta.getFechaDeVenta().compareTo(fin)<0) {
				ventasTotales += venta.calcGanancia();
			}
		}
		return ventasTotales;
	}
	
	public int cantProductosVendidos(LocalDate inicio, LocalDate fin){
		int ventasTotales = 0;
		for(ProductoVendido venta : productosVendidos) {
			if(venta.getFechaDeVenta().compareTo(inicio)>0 &&
				venta.getFechaDeVenta().compareTo(fin)<0) {
				ventasTotales++;
			}
		}
		return ventasTotales;
	}
	
	public int getPonderacion(LocalDate inicio, LocalDate fin) {
		return this.cantProductosVendidos(inicio,fin)/this.getEdad();
	}
	
	public int ratioVentas(LocalDate inicio, LocalDate fin) {
		return this.cantVentasTotales(inicio,fin)/this.cantProductosVendidos(inicio,fin);
	}
	
	@Override
	public int compareTo(Vendedor o) {
		int res = this.getApellido().compareTo(o.getApellido());
		if(res == 0) {
			return this.getNombre().compareTo(o.getNombre());
		}
		return res;
	}
	
//	no redefino equals porque es un String
	public boolean vendio(String cod) {
		for(ProductoVendido producto:this.productosVendidos) {
			if(producto.getCod().equals(cod)) {
				return true;
			}
		}
		return false;
	}
	
	
	public int gananciasTotales() {
		int gananciasTotales = 0;
		for(ProductoVendido producto : this.productosVendidos) {
			gananciasTotales += producto.getPrecio();
		}
		return gananciasTotales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
