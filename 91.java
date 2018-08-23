import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int s,v;
		s=((2*l*b)+(2*b*h)+(2*h*l));
		v=(l*b*h);
		System.out.print(s+" "+v);
	}
}
