package Day11;

import java.util.Scanner;

public class Encapsulation_Ex {
	private String name;
	private int age;
	private double marks;

	
	public String getName() {
		return name;
	}
	
		public void setName(String name) {
		this.name = name;
	}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age=age;
			if(age>=18) {
				System.out.println("You are eligible for voting");
			}
			else {
				System.out.println("You are not eligible for voting");
			}
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Encapsulation_Ex e = new Encapsulation_Ex();
		e.setName("Divya");
		System.out.println("Hello " + e.getName());
		System.out.println("Enter you age:");
		int age=sc.nextInt();
		e.setAge(age);
	}
}
