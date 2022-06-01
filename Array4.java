import java.lang.*;
import java.util.*;

class Array4
{
	int i = 0,j = 0;
	public static void main(String arg[])
	{
	  Scanner sobj = new Scanner(System.in);
	  int i =0;
	  System.out.println("Enter number of rows for jagged array");
	  int size = sobj.nextInt();
	  
		int arr[][] = new int[i][];
		System.out.println("Enter number of columns for each row of jagged array");
		for(int i = 0;i<arr[i].length;i++)
			{
				System.out.println(arr[i]= new int[sobj.nextInt()]);
			}
			
		System.out.println("Enter the elements of array");
		for(int i = 0;i<arr.length;i++)
		{
			for(j = 0;j<arr[i].length;j++)
	        {
				System.out.println(arr[i][j] = sobj.nextInt());
			}			
			
		}		
		System.out.println("elements of array");
		
		for(i = 0;i<arr.length;i++)
		{
			for(j = 0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
				
			}
			System.out.println();
		}

	}
}