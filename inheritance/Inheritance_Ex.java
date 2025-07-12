package inheritance;

import java.util.Scanner;

public class Inheritance_Ex extends If_else {
	public void m1() {
		System.out.println("Inheritance");
		}
	
	public static void main(String[] args) {
		Inheritance_Ex i=new Inheritance_Ex();
		i.m1();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		i.a(age);
		
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		i.b(marks);
		
		i.c();
		i.d();
		
		System.out.println("Enter any two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		i.f(a,b);
		
		System.out.println("Enter any two number:");
		int c=sc.nextInt();
		int d=sc.nextInt();
		i.g(a, b,c,d);
		i.h();
		i.greeting();
		
		String msg=i.greet();
		System.out.println(msg);
				
		i.add(10,20);
		
		int result=i.multiply(5, 4);
		System.out.println("Product is:"+result);
		
		i.m2();
		i.m3();
		i.m4();
	}

	
}
