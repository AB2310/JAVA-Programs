import java.io.*;

class Nsum
{
	public static void main(String args[])
	{
		DataInputStream din;
		int a,b;
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
		 System.out.println("Sum of " +a+ " and " +b+ " is: " +(a+b));
		}
		catch(Exception e)
		{
		 System.out.println("Error is:"+e);
		}
	}
}