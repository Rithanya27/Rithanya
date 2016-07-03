
package reverse;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        int n,reverse=0;
        System.out.println("enter the no");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        while(n!=0)
        {
            reverse=reverse*10;
            reverse=reverse+(n%10);
            n=n/10;
        }
        System.out.println("reverse no is"+reverse);
    }
    
}
 
