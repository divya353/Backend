package Day12;

public class Abstarction_Ex extends One  {
	public void m2() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		 One o=new  Abstarction_Ex();
		 o.m1();
		 o.m2();
	}

}

abstract class One{
	public void m1() {
		System.out.println("With body method");
	}
	public  abstract void m2();
}
