package inheritance;

public class Pattern  extends Array3{

	public void four() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}
