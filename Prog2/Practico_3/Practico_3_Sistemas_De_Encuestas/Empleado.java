package Practico_3_Sistemas_De_Encuestas;

public class Empleado extends Persona{

	double salario;
	
	public Empleado(String nombre, int dni, double salario){
		super(nombre, dni);
		this.salario = salario;
	}
	
	
}
