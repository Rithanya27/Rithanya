
package rev;

import java.util.Scanner;

public class Rev {

    public static void main(String[] args) {
        int n,rev=0;
        System.out.println("enter the no");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        while(n!=0)
        {
            rev=rev*10;
            rev=rev+(n%10);
            n=n/10;
        }
        System.out.println("reverse no is"+rev);
    }
    
}
 
