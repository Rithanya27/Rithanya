
package guvi;

import java.util.Scanner;

public class allchar {
      public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  
 System.out.println("Enter String ");

 String t=s.nextLine();

 int ct=0;
 char[] c=t.toCharArray();
int i=0;
  for(i=0;i<t.length();i++)
  {
  int m=(int)c[i];

  
   if((m>=48)&&(m<=57))
   {
   ct++;
   }
  }

 System.out.println("No.of digits are "+ct);

 System.out.println("No.of chars other than digits are "+(t.length()-ct));

 }
}

    

