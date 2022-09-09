package Practico_2_series;

public class Episodios {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int clasificacion;
		
	public Episodios(String titulo, String descripcion, boolean flag, int clasificacion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = flag;
		this.clasificacion = clasificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getClasificacion() {
		return clasificacion;
	}
	
	//	● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
	//	no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
	
	public void calificarEpisodio(int clasificacion){
		if((clasificacion>=1)&&(clasificacion<=5)) {
			this.clasificacion = clasificacion;
			System.out.println( getTitulo() + " Fue seteado con " + clasificacion + " puntos" );
		}
		else {
			System.out.println(clasificacion + "No es correcto");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
