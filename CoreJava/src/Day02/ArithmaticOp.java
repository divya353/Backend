package Day02;

import java.util.Scanner;

public class ArithmaticOp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  first number:");
		int num1=sc.nextInt();
		System.out.println("Enter a secnod number:");
		int num2=sc.nextInt();
		
		System.out.println("Sum is:"+(num1+num2));
		System.out.println("Substration is"+(num1-num2));
		System.out.println("Multiplication is:"+(num1*num2));
		System.out.println("Division is:"+(num1/num2));
		System.out.println("Mod is:"+(num1%num2));
	}

}
