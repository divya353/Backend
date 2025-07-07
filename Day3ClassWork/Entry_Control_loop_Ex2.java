package Day3ClassWork;

public class Entry_Control_loop_Ex2 {
	public static void main(String [] args) {
		System.out.println("number form 1 to 10:");
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Sum of Even no from 1 to 100 using while loop:");
		int j=0;
		int sum=0;
		
		while(j<=100) {
			if(j%2==0) {
				sum=sum+j;
			}
			
					j++;
		}
		System.out.println("Sum of even number is:"+sum);
	}

}
