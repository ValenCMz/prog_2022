package Practico_1_persona;
import java.time.LocalDate;
/*Valores por defecto:
● El DNI es un valor obligatorio, no posee valor por defecto.
● En caso de la fecha de nacimiento será el 1 de enero de 2000.
● Sexo será Femenino por defecto.
● El nombre por defecto es N y el apellido es N. listo
● El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento…..

La responsabilidad de la clase es la siguiente:
● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura2

● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).

● Saber si está cumpliendo años.

● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años

● Métodos set de cada parámetro, excepto de DNI.

● Saber si puede votar. Es necesario ser mayor de 16 años.

● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.

● Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.

*/


public class Persona {
	final static double MINIMC = 18.5;
	final static double MAXIMC = 25;
	final static int MINMAYOR = 18;
	final static int MINVOTO = 16;
	
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaDeNacimiento;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	
	//Añadimos valores por defecto en un constructor
//	public Persona() {
//		this.nombre = "N";
//		this.apellido = "N";
//		this.fechaDeNacimiento = LocalDate.of(2000,1,1);//1 de enero del 2000 año/mes/dia
//		this.sexo = "femenino";
//		this.peso = 1;
//		this.altura = 1;
//	}
	//Refactor de constructores
	public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento,int dni, String sexo, double peso, double altura ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Construcor con DNI	
	public Persona(int dni) {
		this("N", "N", LocalDate.of(2000, 1, 1),dni,"femenino",1.0,1.0);
	}
	
	//Constructor con DNI nombre y apellido
	public Persona(int dni, String nombre, String apellido) {
		this(nombre, apellido, LocalDate.of(2000, 1, 1),dni,"femenino",1.0,1.0);
	}
	
	//Constructor con DNI nombre apellido y Fecha de nacimiento
	public Persona(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento) {
		this(nombre, apellido, fechaDeNacimiento,dni,"femenino",1.0,1.0);
	}

	//TODOS LOS GET y SET MENOS EL SET DE DNI
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getDni() {
		return dni;
	}	
	//METODOS
	
	//	● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
	//	de masa corporal el cual es peso / altura^2
	public double calculoIMC() {
		double imc;
		imc = this.peso /(Math.pow(this.altura, 2)); //formula: peso/altura^2. con /100 estamos pasandolo
		return imc;
	}
	
	//	● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
	//	entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
	public boolean estaEnForma() {
		double imc = this.calculoIMC();
		if((imc>=MINIMC)&&(imc<=MAXIMC)) {//arreglar constante en codigo //ARREGLADO
			return true;
		}	
		else {
			return false;
		}
	}
	
	//● Saber si está cumpliendo años.
	public boolean esElCumple() {
		LocalDate fechaDeHoy = LocalDate.now();
		if((fechaDeHoy.getMonth()==this.fechaDeNacimiento.getMonth())&&(fechaDeHoy.getDayOfMonth()==this.fechaDeNacimiento.getDayOfMonth())) {
			return true;
		}
		else {	
			return false;
		}
	}
	
	
	public int obtenerEdad() {
		LocalDate ahora = LocalDate.now();
		int yearUser = this.fechaDeNacimiento.getYear();
		int edad = ahora.getYear() - yearUser;
		return edad;
	}
	
	//● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
	
	
	
	
	//● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
	//años
	public boolean esMayorDeEdad() {
		int edad = obtenerEdad();
		if(obtenerEdad()>=MINMAYOR){//arreglar constante en codigo//ARREGLADO
			return true;
		}else 
			return false;
	}
	
	//Saber si puede votar. Es necesario ser mayor de 16 años.
	public boolean puedeVotar() {
		
		if(obtenerEdad()>=MINVOTO) {//ARREGLADO
			return true;
		}else
			return false;
	}
	
	//Mostrar toda la información del objeto. 
	//Es decir devolver un String con la
	//información del mismo.
	public String getInfo() {
		return (getNombre()+ " " + getApellido() + " " + String.valueOf(getEdad()) + " " + String.valueOf(getFechaDeNacimiento()) + " " + String.valueOf(getDni())+ " " + getSexo() + " " + String.valueOf(getPeso()) + " " + String.valueOf(getAltura()) );
	}
	

	public void imprimir() {
		System.out.println("Nombre: " + nombre + "\nApellido " +apellido + "\nEdad " + edad + "\nFecha de Nacimiento: "+ fechaDeNacimiento+ "\nDNI: "+ dni+ "\nSexo: " + sexo + "\nPeso: " + peso+ "\nAltura: " + altura); 
	}

	
	
}
