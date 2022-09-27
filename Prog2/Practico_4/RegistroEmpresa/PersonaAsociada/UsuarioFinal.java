package RegistroEmpresa.PersonaAsociada;

public class UsuarioFinal extends PersonaAsociada{
	private String nombreUsuario;
	private String password;
	
	public UsuarioFinal(String cargoDeLaPersona, String nombre, String apellido, int edad, String nombreUsuario,
			String password) {
		super(cargoDeLaPersona, nombre, apellido, edad);
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
	
	
	
}
