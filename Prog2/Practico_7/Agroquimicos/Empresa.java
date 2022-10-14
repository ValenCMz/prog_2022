package Agroquimicos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<ProductoQuimico>productos;
	
	public Empresa() {
		this.productos = new ArrayList<>();
	}

	public void addProducto(ProductoQuimico pq) {
		this.productos.add(pq);
	}
	
//	Sistema par empresa agricola:
//		fabricacion y venta de productos quimicos. 
//	*Debe ser usado para decidir que agroquimico se puede utilizar para tratar ciertas enfermedades de los cultivos
//	*Dado un productoQuimico, el cultivo es capaz de decir 
//		si es de utilidad o no(el producto puede tratar una de sus enfermedades frecuentes)
//		-El producto trata una enfermedad si los estados patalogicos estan contenido por las acciones del producto quimico
//	*Dado un cultivo y una enfermedad, devolver una lista de agroquimicos con los que pueden tratar.(Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
//	determinados cultivos)
	
//	*Proveer listado de agroquimicos que pueden tratar una enfermedad determinada
	public ArrayList<ProductoQuimico> productosQueTratanEnfermedad(Enfermedad enfermedad) {
		ArrayList<ProductoQuimico>productoCumple = new ArrayList<>();
		for(ProductoQuimico producto : productos) {
			if(enfermedad.puedeSerTratada(producto)) {
				productoCumple.add(producto);
			}
		}
		return productoCumple;
	}
	
//	*Dado un cultivo y una enfermedad, devolver una lista de agroquimicos con los que pueden tratar.
	//(Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre determinados cultivos)
	
	public ArrayList<ProductoQuimico> productosQueTratanCultivoYEnfermedad(Cultivo cultivo,Enfermedad enfermedad){
		ArrayList<ProductoQuimico>productoCumple = new ArrayList<>();
		for(ProductoQuimico producto:productos) {
			if((!producto.esCultivoDesaconsejado(cultivo))&&(enfermedad.puedeSerTratada(producto))) {
				productoCumple.add(producto);
			}
		}
		return productoCumple;
	}
}
