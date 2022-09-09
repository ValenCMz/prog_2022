package Practico_1_electrodomesticos;

public class Practico_1_electrodomesticos {

	public static void main(String[] args) {
		
		Electrodomesticos e1 = new Electrodomesticos("Juan", 200, "rojo", 60, 15);
		System.out.println(e1.esBajoConsumo());
		System.out.println(e1.calculoBalance());
		System.out.println(e1.altaGama());
	}

}
