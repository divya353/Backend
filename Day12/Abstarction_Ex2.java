package Day12;

public class Abstarction_Ex2 extends Animal {
	
	public void eat() {
		System.out.println("Abstarction Example");
	}
	
	public static void main(String [] args) {
		Abstarction_Ex2 a=new Abstarction_Ex2();
		a.eat();
		Cat c=new Cat();
		c.eat();
		Tiger t=new Tiger();
		t.eat();
		Cow co=new Cow();
		co.eat();
				
	}

}
  
class Cat {
	public void eat() {
		System.out.println("Cat is eating");
	}	
}

class Tiger{
	public void eat() {
		System.out.println("Tiger is eating ");
	}
}

class Cow{
	public void eat() {
		System.out.println("Cow is eating");
	}
}



abstract class Animal{
	public abstract void eat();
	
}
