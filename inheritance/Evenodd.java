package inheritance;

public class Evenodd  extends Positive_Negative{
  public void  even(int a) {
	  if(a%2==0) {
		  System.out.println("Entered number is even: "+a);
	  }
	  else {
		  System.out.println("Entered number is odd: "+a);
	  }
  }
}
