package Day9;


public class Interfaces extends ClassA implements Y,X,N,O,F {
	public static void main(String[] args) {
		Interfaces i=new Interfaces();
		i.hello();
		i.hello1();
		i.hello2();
		i.hello3();
		i.hello4();
		i.add(5, 10);
		i.greet();
		i.multi(4, 5);
		i.div(2, 4);
		i.mod(3, 5);
		i.pattern();
		
	}

	
	public void hello() {
		System.out.println("Interface Y");
		
	}


	public void hello1() {
		System.out.println("Interface X");

	}


	
	public void hello2() {
		System.out.println("Interface N");
	}


	
	public void hello3() {
		System.out.println("Inetface O");		
	}


	
	public void hello4() {
		System.out.println("Interface F");
		
	}
	

}

interface Y{
	void hello();
}

interface X{
	void hello1();
}

interface N{
	void hello2();
}

interface  O{
	void hello3();
}

interface F{
	void hello4();
}