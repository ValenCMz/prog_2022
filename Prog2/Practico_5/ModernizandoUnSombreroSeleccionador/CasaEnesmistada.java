package ModernizandoUnSombreroSeleccionador;

import java.util.ArrayList;

public class CasaEnesmistada extends Casa{
	private ArrayList<Casa>casasEnemistadas;

	public CasaEnesmistada(int maxAlummos) {
		super(maxAlummos);
		this.casasEnemistadas = new ArrayList<>();
	}
	
	public boolean permiteAlumno(Alumno alumno) {
		if(super.permiteAlumno(alumno)) { //reutilizo 
			for(int i = 0; i<casasEnemistadas.size();i++) {
				if(alumno.aceptado(casasEnemistadas.get(i))) {
					return false;
				}
			}
		}
		return true;
	}
	
	
}
