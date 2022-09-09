package Practico_3_Fabrica_De_Muebles;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Producto p1 = new Producto("mesa", 20, 400, "roble", "marron");
		Producto p2 = new Producto("silla", 10, 200, "aaa", "azul");
		FabricaDeMuebles fm = new FabricaDeMuebles();
		
		fm.addProducto(p1);
		fm.addProducto(p2);
		fm.addProductoEnStock(p1);
		fm.addProductoEnStock(p2);
		
		System.out.println(fm.getProductosEnStock());
		System.out.println(fm.getPrecioVenta("silla"));
	
		}

}
