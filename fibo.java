
package fibo;

import java.util.Scanner;

public class Fibo {

    public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count;
 System.out.println("enter the no");
        Scanner ob=new Scanner(System.in);
        count=ob.nextInt();
 System.out.print(n1+" "+n2);    
    
 for(i=2;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
    }
    
    
}