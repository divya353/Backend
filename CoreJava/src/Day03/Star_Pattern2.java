package Day03;

public class Star_Pattern2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) { 		
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	
	
		for(int a=4;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
