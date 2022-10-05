package CongresoDeCienciasDeLaComputacion;

import java.util.ArrayList;

public class TrabajoPoster extends Trabajo {

	public TrabajoPoster(String nombre) {
		super(nombre);	
	}
	
	
	public boolean evaluadorEsApto(Evaluador evaluador) {
										//super solo para redefinir el mismo metodo
		ArrayList<String>palabrasClaves = this.getPalabrasClave();
		boolean coincideUno = false;
		int i = 0;
		while(!coincideUno && palabrasClaves.size()>i) {
			if(evaluador.contieneTema(palabrasClaves.get(i))) {
				coincideUno = true;
			}
		}
		return coincideUno;
	}
}
