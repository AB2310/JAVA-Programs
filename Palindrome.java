import java.io.*;
public class Palindrome{

public static int reverseNum(int num){
	int digit,rev=0;
	while(num!=0){
		digit=num%10;
		rev=(rev*10)+digit;
		num=num/10;
	}
	return rev; 
}

public static int palindromeChecker(int num){
	int rev=reverseNum(num);
	if(num == rev){
		return 1;
	}
	else{
		return 0;
	}
}

public static void main(String args[]){
	System.out.println("ABEY THOMSON");

	DataInputStream din;
	din = new DataInputStream(System.in);
	try{
		System.out.println("\nEnter an integer to check for palindrome:");
		int num=Integer.parseInt(din.readLine());
		if(palindromeChecker(num)==1){
			System.out.println(num+" is a Palindrome.");
		}
		else{
			System.out.println(num+" is NOT a Palindrome.");
		}
	}
	catch(Exception e){
		System.out.println("Error : "+e);
	}
}
}