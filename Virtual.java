import java.lang.*;

class Base
{
	public int i,j;      //Defination
	public void fun()
	{ System.out.println("Base fun");}
	
	public void gun()      //Defination
	{ System.out.println("Base gun");}
	
	public void sun()     //Defination
	{ System.out.println("Base sun");}
}

class Derived extends Base
{
	public int x,y;
	
	public void fun()      //Overriding
	{ System.out.println("Derived fun");}
	
	public void sun()       //Overriding
	{ System.out.println("Derived sun");}
	
	public void run()        //Defination
	{ System.out.println("Derived run");}
}

class Virtual
{
	public static void main(String arg[])
	{
		//Base bobj = new Base();            //no casting
		//Derived dobj = new Derived();     //NO Casting
		
		Base obj = new Derived();         //Upcasting  //Base *bp = new Derived
		//Derived obj2 new Base();           //Downcasting
	
	    obj.fun();  //bp->fun()
		obj.gun();
		obj.sun();
		//obj.run();
	}  
	
}