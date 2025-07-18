package Day12;

public class Abstraction_Ex3  {
public static void main(String [] args) {
	
}
}



abstract class Animals extends Arith{
	public void eat() {
		System.out.println("Cat is eating");
	}
	public abstract void eat1();
}


abstract class Arith extends Loops{
	public void add() {
		System.out.println("Addition is: ");	
	}
	
	public abstract void add1();
}

abstract class Loops extends Even {
	public void loop() {
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
	}
	public abstract void loop1();
}

 abstract class Even{
	 public void m1() {
		 for(int i=0;i<=10;i+=2) {
				System.out.println(i);
			}

	 }
	 public abstract void even1();
	 
 }

