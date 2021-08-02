package Logical_Prograaming;

import java.util.Scanner;

public class Example1_Accept_Input_From_Users
{
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter sname:");
	
	String sname=scan.next();
	
	System.out.println("Student name:"+sname);
}

}

