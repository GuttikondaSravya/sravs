import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int base=2,exponent=3;
		long result=1;
		while(exponent !=0)
		{
			result *=base;
			--exponent;
	  }
	    System.out.println(result);
	}
}
