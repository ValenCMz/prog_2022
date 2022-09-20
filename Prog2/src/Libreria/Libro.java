package Libreria;

public class Libro extends Producto{
	private int cantPaginas;
	private String generLiterario;
	private String resumen;
		
	public Libro(String nombre, String autor, double precio, int cantPaginas, String generLiterario, String resumen) {
		super(nombre, autor, precio);
		this.cantPaginas = cantPaginas;
		this.generLiterario = generLiterario;
		this.resumen = resumen;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public String getGenerLiterario() {
		return generLiterario;
	}

	public void setGenerLiterario(String generLiterario) {
		this.generLiterario = generLiterario;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	 
	
	
	
	

}
