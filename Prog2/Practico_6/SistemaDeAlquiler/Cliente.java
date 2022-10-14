package SistemaDeAlquiler;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private long dni;
	private ArrayList<Item>itemsAlquilados;
	
	public Cliente(String nombre, long dni, ArrayList<Item>itemsAlquilados) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.itemsAlquilados = itemsAlquilados;
	}
	
	public void alquilarItem(Item item) {
		this.itemsAlquilados.add(item);
	}

	public ArrayList<Item> getItemsAlquilados() {
		return new ArrayList<>(itemsAlquilados);
	}
	
	
}
