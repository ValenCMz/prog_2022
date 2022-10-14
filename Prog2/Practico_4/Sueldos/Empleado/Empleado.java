package Sueldos.Empleado;

public abstract class Empleado {
	public static final double MONTOFIJO = 200;
	private String nombre;
	private long dni;
	
	public Empleado(String nombre, long dni) {
		this.dni = dni ;
		this.nombre=nombre;
	}

	public long getDni() {
		return dni;
	}

	@Override
	public boolean equals(Object obj) {
	try {
		Empleado e1 = (Empleado)obj;
		return this.getDni() == e1.getDni();
	}
	catch(Exception e) {
		return false;
	}
	}


	public abstract double cuantoCobra();
}
