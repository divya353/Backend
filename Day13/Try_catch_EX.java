//Arithmatic Exception
package Day13;

import java.util.Scanner;

public class Try_catch_EX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter First number:");
			int no1=sc.nextInt();
			System.out.println("Enter Second Number:");
			int no2=sc.nextInt();
			int result= no1/no2;
			System.out.println("Division is:"+result);
		}
		catch(Exception e) {
			System.out.println("Can not divided by zero");
			}
		}
	
	
} 
