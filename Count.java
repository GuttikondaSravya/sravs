import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,num=5480;
		while(num!=0)
		{
			num/=10;
			++count;
		}
		   System.out.println("Number of digits:" +count);
		
	}
}
