import java.util.Scanner;
public class Factorial
{
    public Factorial(int n)
    {
        int fact = 1;
        for(int i = n;i>=1;i--)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter a number to find factorial :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Factorial obj = new Factorial(n);
    }
}
