package Day13;

import java.util.Scanner;

public class Try_Catch {
	public static void main(String[] args) {
		
//		One o=new One();
//		o.m1();
//		
//		Two t=new Two();
//		t.m2();
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Array elements:");
			int arr1[]=new int[5];
			for(int i=0;i<=arr1.length;i++) {
				arr1[i]=sc.nextInt();
			}
		}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}
		
		
}
	
	
//Without Try and Catch Block
//class One{
//	public void m1() {
//		int arr1[]= {1,2,3,4,5};
//		System.out.println(arr1[9]);
//	}
//}

//With Try and catch block

//class Two{
//	public void m2() {
//		try {
//			int arr2[]= {1,2,3,4,5};
//			System.out.println(arr2[9]);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
//	}
//}


