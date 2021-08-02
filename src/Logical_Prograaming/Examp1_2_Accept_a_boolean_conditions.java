package Logical_Prograaming;

import java.util.Scanner;

public class Examp1_2_Accept_a_boolean_conditions 
{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter conditons:");
		
		boolean result = scan.hasNext();
		
		System.out.println("Given conditions is:"+result);
		
	}

}
