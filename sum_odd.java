
package guvi;

public class sumodd {
    public static void main(String args[])
	{
		int sum = 0;
    for(int i = 1;i <= 15;i++)
		{
			sum = sum + i;
                }
		System.out.println("The Sum Of Numbers are:" + sum);

    int n=0;
    for(int i = 15;i <= 45;i++)
    {
      
			if(i%2!=0)
    {
        n = n + i;
		
}
    }
    System.out.println("The Sum Of Odd Numbers are:" + n);
    }
        }
