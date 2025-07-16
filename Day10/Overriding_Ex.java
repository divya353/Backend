package Day10;

import java.util.Scanner;

public class Overriding_Ex {
	 public static void arith(int a,int b) {
		 System.out.println("Addition is: "+(a+b));
		 System.out.println("Substraction is: "+(a-b));
		 System.out.println("Multiplication is: "+(a*b));
		 System.out.println("Division is: "+(a/b));
		 
	 }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 Overriding_Ex.arith(a,b);
		 Overriding_ex2.arith(a,b);
		 
	}
	
	
	

}

class Overriding_ex2{
	public static void arith(int a,int b) {
		int result=a*b;
		System.out.println("Multiplication is: " +result);
	}
}
