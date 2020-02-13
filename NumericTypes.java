/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class NumericTypes
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    //TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		double score1 = 100; // first test score
		double score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperatures
		double userTemperature;
		//Task #2 prompt user to input score1
		System.out.println("Please input Score1: "); 
	    
		//Task #2 read score1 
		score1 =  in.nextInt();
		//Task #2 prompt user to input score2
		System.out.println("Please input Score2: "); 
		//Task #2 read score2 
		score2 =  in.nextInt();
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5/9 * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Please input Another Temperature in Farenheight: "); 
		//Task #2 read the user’s temperature in Fahrenheit
		userTemperature =  in.nextDouble();
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
			System.out.println("The temperature you've entered in Celcisius is here: " + (.555*(userTemperature-32))); 
		
		System.out.println("Goodbye"); // to show that the program is ended	
		
	}
}
