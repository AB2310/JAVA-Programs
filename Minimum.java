import java.io.*;

class Minimum
{
	public static void main(String args[])
	{
		DataInputStream din;
		int a,b,c,min;
		String s;
		din=new DataInputStream(System.in);
		System.out.println("ABEY THOMSON");
		try
		{
		 System.out.println("Enter the first number:");
		 s=din.readLine();
		 a=Integer.parseInt(s);
		 System.out.println("Enter the second number:");
		 s=din.readLine();
		 b=Integer.parseInt(s); 
		 System.out.println("Enter the third number:");
		 s=din.readLine();
		 c=Integer.parseInt(s);
		 min=Integer.parseInt(s);
		 min = Math.min(Math.min(a, b), c);
		 System.out.println("The minimum of the three numbers is: " + min);
		}
		catch(Exception e)
		{
		 System.out.println("Error is:"+e);
		}
	}
}