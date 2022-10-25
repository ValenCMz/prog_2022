package SistemaElectoral;

import SistemaElectoral.Filtros.Filtro;

public abstract class Establecimiento {
	// conocer el porcentaje de votos recibidos por un candidato particular.
	public abstract double getPorcDeVotosPorCandidato(Filtro f1);
	//conocer el porcentaje de votos en blanco recibidos.
	public abstract double getPorcDeVotosEnBlanco(Filtro f1);
	//conocer el porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate implementa la interface Comparable)
	public abstract double getPorcDeVotosEntreHorarios(Filtro f1);
	//conocer la cantidad total de votos que se emitieron.
	public abstract double getCantidadDeVotosEmitidos();
	
	
//	Obtener un listado de todos los candidatos que se presentan a la elección, ordenado
//	por partido político si son del mismo partido ordenarlos por agrupación; y si son de la
//	misma agrupación ordenarlos por nombre
}
