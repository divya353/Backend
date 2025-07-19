package Day13;

import java.util.Scanner;

public class InputMissmatch_ex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a frist number:");
			int no1=sc.nextInt();
			System.out.println("Enter second number:");
			int no2=sc.nextInt();
			int result=no1-no2;
			System.out.println("Substraction is:"+result);
		}
		catch(Exception e) {
			System.out.println("Input Missmatch: Enter integar value only" );
			
		}
	}

}
