import java.util.*;

class Exeption2
{
	public static void main(String arg[])
	{
		int ans = 0,no1 = 0,no2 = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Plese enter first number :");
		no1 = sobj.nextInt();
		
		System.out.println("Plese enter second number :");
		no2 = sobj.nextInt();
		
		try
		{
		   ans = no1/no2;    //Exeptio prone code
		}
		
		catch(ArithmeticException obj)
		{
		System.out.println("Exeption occured as:"+obj);
		}
		finally
		{
		sobj.close();
		}
		
		
		System.out.println("Division is:"+ans);
		sobj.close();
	}
	
}