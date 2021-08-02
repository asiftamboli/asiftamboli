package Logical_Prograaming;

import java.util.Arrays;

public class Example4_multipliy_2_Num_without_Multiplication_operator 
{
	public static void main(String[] args)
	{
		int n1=10;
		int n2=20;
		int sum=0;
		
		
		for(int i=1;i<=n2;i++)
		{
			sum=sum+n1;
		}
	
		System.out.println(sum);
		
		
		
	
		int arr1[]= {10,20,30};
		int arr2[]= {10,20,30};
		int arr3[]= {20,30,40};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		System.out.println(Arrays.equals(arr3, arr2));
		
	}
	

}
