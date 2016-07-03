
package guvi;

import java.util.Scanner;

public class numbcount {
    public static void main(String args[])
 {

 Scanner s=new Scanner(System.in);

 String st=s.nextLine();

 int count=0;

 char[] c=st.toCharArray();

  for(int i=0;i<st.length();i++)
  {
  int k=(int)c[i];

   // Digits ascii values start from 48 till 57
   if((k>=48)&&(k<=57))
   {
   count++;
   }
  }
 System.out.println("No.of digits are "+count);
 System.out.println("No.of chars other than digits are "+(st.length()-count));

 }
}

