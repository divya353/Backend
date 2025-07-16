package Day10;

import java.util.Scanner;

public class Overloading_Ex {
    
    public static void m1(int a) {
        if (a > 0) {
            System.out.println("Number is positive: " + a);
        } else {
            System.out.println("Number is Negative: " + a);
        }
    }

    public static void m1(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max number is: " + a);
        } else if (b > c) {
            System.out.println("Max number is: " + b);
        } else {
            System.out.println("Max number is: " + c);
        }
    }

    public static void m1() {
        System.out.println("Odd numbers from 1 to 10:");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    public static void m1(int d, String name) {
        System.out.println("Hello, " + name);
        if (d > 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
    }

    public static void m1(int no, double p) {
        int Count = 0;
        if (no != 0) {
            if (no % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

            for (int i = 1; i <= no; i++) {
                if (no % i == 0) {
                    Count++;
                }
            }

            if (Count == 2) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        } else {
            System.out.println("Invalid");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

         System.out.println("Enter your age:");
        int d = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter your Name:");
        String name = sc.nextLine();

               
        System.out.println("Enter any number to check number is even/odd/prime:");
        int no = sc.nextInt();

        
        m1(a);                     
        m1(a, b, c);       
        m1();              
        m1(d, name);       
        m1(no, 1.1);       
        
    }
}
