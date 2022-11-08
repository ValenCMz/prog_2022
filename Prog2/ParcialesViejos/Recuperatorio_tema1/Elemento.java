package Recuperatorio_tema1;

import java.util.ArrayList;

import Recuperatorio_tema1.Filtros.Filtro;


public abstract class Elemento {
	
	public abstract ArrayList<Habitacion>buscar(Filtro f);
	public abstract int getMestrosCuadrados();

}
