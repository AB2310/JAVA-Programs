import java.io.*;

class Maximum
{
	public static void main(String args[])
	{
		DataInputStream din;
		int a,b,c;
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
		 if(a>b && a>c)
		 	System.out.println("Maximun is "+a);
		 else if(b>a && b>c)
		 	System.out.println("Maximum is "+b);
		 else
		 	System.out.println("maximun is "+c);
		}
		catch(Exception e)
		{
		 System.out.println("Error is:"+e);
		}
	}
}