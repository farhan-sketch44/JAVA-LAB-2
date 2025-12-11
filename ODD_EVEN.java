import java.util.*;
public class ODD_EVEN{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,even=0,odd=0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter a number");
            n=sc.nextInt();
            if(n%2==0)
            {
                System.out.println(n+"is a even number");
                even=even+1;
            }
            else {
                System.out.println(n+"is a odd number");
                odd=odd+1;
            }
            System.out.println("Total no of even numbers is"+even);
            System.out.println("Total no of odd numbers is"+odd);
        }
    }
}