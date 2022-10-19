package SistemaDeArchivos;

public class Main {

	public static void main(String[] args) {
		Directorio raiz = new Directorio("raiz");
		
		Directorio carpeta1 = new Directorio("carpeta1");
		
		Archivo archivo1 = new Archivo("archivo1", 20);
		Archivo archivo2 = new Archivo("archivo2", 30);
		Archivo archivo3 = new Archivo("archivo3", 10);
		
		raiz.addElemento(carpeta1);
		raiz.addElemento(archivo1);
		
		carpeta1.addElemento(archivo2);
		carpeta1.addElemento(archivo3);
		
		System.out.println(raiz.getCantElementos());
		
	}

}
