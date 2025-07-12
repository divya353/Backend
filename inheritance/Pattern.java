package inheritance;

public class Pattern extends Function1 {
	public void h() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
