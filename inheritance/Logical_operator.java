package inheritance;

public class Logical_operator extends Pattern {
	public void g(int a,int b,int c,int d) {
		if(a>b && a>c && a>d) {
			System.out.println("Max number is:"+a);
		}
		else if(b>c && b>d) {
			System.out.println("Max number is:"+b);
		}
		
		else if(c>d) {
			System.out.println("Max number is:"+c);
		}
		else {
			System.out.println("Max number is:"+d);
		}
		
		
		
	}

}
