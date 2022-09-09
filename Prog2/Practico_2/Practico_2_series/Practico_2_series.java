package Practico_2_series;

public class Practico_2_series {

	public static void main(String[] args) {
		Series s1 = new Series("Naruto", "Ninjas", "Masashi Kishimoto", "Ninjas");
		Temporadas t1 = new Temporadas();
		Temporadas t2 = new Temporadas();
		Temporadas t3 = new Temporadas();
		Episodios e1 = new Episodios("1", "jaja", true, 4);
		Episodios e2 = new Episodios("1", "jaja", true, 3);
		Episodios e3 = new Episodios("1", "jaja", true, 4);
		Episodios e4 = new Episodios("1", "jaja", false, 8);
		t1.addEpisodio(e1);
		t1.addEpisodio(e2);
		t1.addEpisodio(e3);
		t1.addEpisodio(e4);
		
		t2.addEpisodio(e1);
		
		t3.addEpisodio(e1);
		t3.addEpisodio(e2);
		
		s1.addTemporada(t1);
		s1.addTemporada(t2);
		s1.addTemporada(t3);
		
		//e1.calificarEpisodio(4);
		//System.out.println(t1.getCantEpisodiosVistos()); 
		System.out.println(s1.getCantidadEpisodiosVistos());
		System.out.println(t1.getPromedioCalificaciones());
		
		System.out.println(s1.getPromedioCalificaciones());
	}

}
