package ProbandoComposite;

public class Main {
	
	public static void main(String[] args) {
		Simple simple = new Simple();
		Simple simpleHereda = new HeredaDeSimple();
		
		System.out.println(simple.getHola());
		System.out.println(simpleHereda.getHola());

	}

}
