import java.util.*;

class Exeption1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Plese enter first number :");
		int no1 = sobj.nextInt();
		
		System.out.println("Plese enter second number :");
		int no2 = sobj.nextInt();
		
		int ans = no1/no2;
		
		System.out.println("Division is:"+ans);
		sobj.close();
	}
	
}