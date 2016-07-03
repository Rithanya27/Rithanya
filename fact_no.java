
package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int a,n,fact=1;
        Scanner ob=new Scanner(System.in);
 System.out.println("enter the fact no");
                n=ob.nextInt();
                        for(a=1;a<=n;a++){
                            fact=fact*a;
                        }
                        System.out.println("f"+fact);
                        
                        
