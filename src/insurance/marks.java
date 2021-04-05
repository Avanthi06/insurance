package insurance;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		int maths;
		int science;
		int english;
		int social;
		int hindi;
		float avg,per;
		
		System.out.println("Enter 5 subject marks: ");
		 Scanner s= new Scanner(System.in);
	      
	      maths = s.nextInt();
	      science=s.nextInt();
	      english=s.nextInt();
	      social=s.nextInt();
	      hindi=s.nextInt();
	      per = (maths + science+ english + social +hindi) * 100 / 500;
		System.out.println( per);
		if (per >= 60)
			System.out.println("1st Division");
		else if (per >= 50 && per <= 59)
			System.out.println("2nd Division");
		else if (per >= 40 && per <= 49)
			System.out.println("3rd Division");
		else if (per<40)
			System.out.println("Fail");
		
	}

	}


