/**
 * 
 * @author gtalwar
 *
 */

import java.util.Scanner;


public class Addition 


{
	public static void sum()
	
	{
		int x,y,z;
		System.out.println("Enter two numbers to calculate their sum:");
		Scanner in = new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		z=x+y;
		
		System.out.println("Sum of the numbers="+ z);	
		
	}
	

	public static void main(String arg[])
	{
		sum();
	}

}
