import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
     int r,sum=0,temp;    
     int n=454;  
     temp=n;    
     while(n>0)
   {    
     r=n%10;    
     sum=(sum*10)+r;    
     n=n/10;    
  }    
     if(temp==sum)    
     System.out.println("palindrome number ");    
     else    
     System.out.println("not palindrome");  
	}
}
