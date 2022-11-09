package InternetMovieData;

import java.util.ArrayList;

public class Actor {
	private String nombre;
	private String apellido;
	private int anioNacimiento;
	private ArrayList<Elemento>peliculasActuo;
	
	public Actor(String nombre, String apellido, int anioNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioNacimiento = anioNacimiento;
		this.peliculasActuo = new ArrayList<>();
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

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public ArrayList<Elemento> getPeliculasActuo() {
		return peliculasActuo;
	}

	public void setPeliculasActuo(ArrayList<Elemento> peliculasActuo) {
		this.peliculasActuo = peliculasActuo;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Actor a1 = (Actor)obj;
			return a1.getNombre().equals(this.getNombre());
		}catch(Exception e) {
			return false;
		}
	}

 
}
