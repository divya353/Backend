package inheritance;

import java.util.Scanner;

public class MultilevelInheritance extends Arithmatic  {
	public void fun1() {
        System.out.println("Multilevel inheritance");
    }
	public static void main(String[] args) {
		MultilevelInheritance i=new MultilevelInheritance();
		i.fun1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first  number:");
		int a=sc.nextInt();
		System.out.println("Enter a Second   number:");
		int b=sc.nextInt();
		
		i.one(a,b);
		i.even(a);
		i.two(a);
		
		System.out.println("Enter third number:");
		int c=sc.nextInt();
		i.two(a,b,c);
		i.m2();
		i.three();
	    i.four();
	    i.five();
	   
	}
}
