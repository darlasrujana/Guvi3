/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter n value");
	int n=sc.nextInt();
	int rem;
	int temp=n;
	int rev=0;
	while(n>0)
	{
	rem=n%10;
	rev=rev*10+rem; 
	n=n/10;
	}
	if(rev==temp)
	
		System.out.print("Yes");
	
	else
	
		System.out.print("No");
	
	
	}
}
