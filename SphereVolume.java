/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class SphereVolume 
{
	public static void main(String[] args) {
	    
	       Scanner in = new Scanner(System.in);
	       
	 double diameter;
	 
		System.out.println("The purpose of this program is to find the radius of a sphere:");
		
		System.out.println("What is the diameter of your Sphere:");
		diameter = in.nextDouble();
		
			System.out.println("The diameter you've entered is " + diameter);
			System.out.println("The radius you've entered is " + (diameter/2));
		double radius = (diameter/2);
			double volume =(4.0 / 3) * Math.PI * Math.pow(radius, 3);
			System.out.println("Your volume is " + volume );
		
	}
}
