package UsoDeSuper;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	public int getA1() {
		return 1;
	}
	
	public int getA2() {
		return 2;
	}
	
	public int getA3() {
		return this.getA1()+this.getA2();
	}
}
