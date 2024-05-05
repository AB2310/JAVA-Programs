import java.io.*;

class Swap
{
	public static void main(String args[])
	{
		DataInputStream din;
		int a,b,temp;
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
		 temp=Integer.parseInt(s);
		 System.out.println("Numbers before swapping are a= "+a+" and b= " +b);
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("Numbers after swapping are a= "+a+" and b= " +b);
		}
		catch(Exception e)
		{
		 System.out.println("Error is:"+e);
		}
	}
}