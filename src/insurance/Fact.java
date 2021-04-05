/**
 * 
 */
package insurance;

import java.util.Scanner;

public class Fact{
	public static void main(String[] args) {
		    int number ;
	        long fact =1;
	        
	        System.out.println("enter the number");
	        Scanner s= new Scanner(System.in);
		      
		      number = s.nextInt();
		      
	        for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
	        System.out.println("Factorial of "+number +" is: "+fact);
	    }
	}

	


