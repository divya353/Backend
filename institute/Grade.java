package institute;

public class Grade {
	
	public void grade(int marks) {
		if(marks>90) {
			System.out.println("Grade is:A "+marks);
		}
		else if(marks>80) {
			System.out.println("Grade is:B "+marks);
		}
		
		else if(marks>70) {
			System.out.println("Grade is:C "+marks);
		}
		
		else if(marks>60) {
			System.out.println("Grade is:D "+marks);
		}
		
		else if(marks>50) {
			System.out.println("Grade is:E "+marks);
		}
		else {
			System.out.println("Grade is:Fail "+marks);

			
		}



		
	}

}
