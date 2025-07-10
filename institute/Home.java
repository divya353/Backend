package institute;
import java.util.Scanner;
import institute.EvenOdd_no;
import institute.Positive_Negative;
import institute.Pattern;
import institute.Operator;
import institute.Grade;
import institute.Array;
import institute.Arithmetic;

public class Home {
	public static void main(String[] args) {
		System.out.println("Hello world");	
		EvenOdd_no n=new EvenOdd_no();
		n.evenodd();
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a=sc.nextInt();
	
	Positive_Negative n1= new Positive_Negative();
	n1.num(a);
	
	Pattern p=new Pattern();
	p.p1();
	
	System.out.println("Enter any three number:");
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	
	
	Operator oper=new Operator();
	oper.op(b, c, d);

	System.out.println("Enter marks:");
	int marks=sc.nextInt();
	
	Grade g=new Grade();
	g.grade(marks);
	
	System.out.println("Array element is:");
	Array ar=new Array();
	ar.f1();
	
	System.out.println("Enyer any two number:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	Arithmetic operation=new Arithmetic();
	operation.arith(num1, num2);
	
	
	}
}
