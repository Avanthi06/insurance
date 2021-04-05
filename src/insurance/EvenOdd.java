package insurance;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		    int x;
		    System.out.println("Enter an integer check if it's odd or even");
		    Scanner s = new Scanner(System.in);
		    x = s.nextInt();

		    if (x % 2 == 0) {
		      System.out.println("The number is even.");
		    }
		    else
		      System.out.println("The number is odd.");
		  }
	}

	
