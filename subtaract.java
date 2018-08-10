import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
{
     Scanner in=new Scanner(System.in);
     int h1=in.nextInt();
     int m1=in.nextInt();
     int h2=in.nextInt();
     int m2=in.nextInt();
     int n,h,m;
    	 h=Math.abs(h1-h2);
    	m=Math.abs(m1-m2);
     System.out.println(h+" "+m);
	}
}
	
