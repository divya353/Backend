package inheritance;

public class Grater_Number extends Array {
	public void two(int a,int b,int c) {
		if(a>b && b>c) {
			System.out.println("Grater number is: "+a);
		}
		else if(b>c) {
			System.out.println("Grater number is: "+b);
		}
		else {
			System.out.println("Grater number is: "+c);
		}
	}

}
