package Libreria;

public class EjemploLibreria {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Gonzalo", "Salomon", 1, null);
		c1.addAutorFavorito("s");
		c1.addAutorFavorito("v");
		
		c1.addGenerosFavoritos("1");
		c1.addGenerosFavoritos("2");
		
		Libro l1 = new Libro("no importa", "s", 0, 0, "3", null);
		
		System.out.println(c1.leGusta(l1));

		Cliente c2ElArrayAtril = c1;
		
		System.out.println(c2ElArrayAtril.leGusta(l1));
		
		c1.setComportamiento(new ComportamientoAutor());
		
		System.out.println(c2ElArrayAtril.leGusta(l1));
		System.out.println(c1.leGusta(l1));

	}

}
