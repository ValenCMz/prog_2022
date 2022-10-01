package ModernizandoUnSombreroSeleccionador;


public class CasaSangrePura extends Casa {
	public CasaSangrePura(int maxAlummos) {
		super(maxAlummos);
	}

	//para agregar el alumno:
		//el alumno debe contar con un familiar que pertenezca a la casa
	public boolean permiteAlumno(Alumno alumno) {
		if(alumno.tieneFamiliares(this)) {
			this.agregarAlumno(alumno);
			return true;
		}
		return false;
	}
	
}