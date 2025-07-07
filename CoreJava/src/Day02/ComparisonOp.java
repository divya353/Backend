// Prime number with even/odd check
package Day02;

import java.util.Scanner;

public class ComparisonOp {
    public static void main(String[] args) {
        int Count = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();

        if (no != 0) {
           
            if (no % 2 == 0) {
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }

            
            for (i = 1; i <= no; i++) {
                if (no % i == 0) {
                    Count++;
                }
            }

            if (Count == 2) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}
