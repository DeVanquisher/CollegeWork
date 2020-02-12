import java.util.Scanner;
public class Operation {
    void arith(int a,int b)
    {
        int c;
        c = a+b;
        System.out.println("Addition is "+c+".");
        if (a>b)
        {
            c = a-b;
            System.out.println("Subtraction is "+c+".");
        }
        else{
            c = b-a;
            System.out.println("subtraction is "+c+".");
        }
        c = a*b;
        System.out.println("Product is "+c+".");
    }
    void conditional(int i,int j){
        System.out.println("Greatest among two numbers.");
        if(i>j){
            System.out.println(i+" is greater than "+j+".");
        }
        else{
            System.out.println(j+" is greater than "+i+".");
        }
    }
    public static void main(String args[]){
        int a,b;
        Operation obj = new Operation();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("Enter Second number :");
        b = sc.nextInt();
        obj.arith(a,b);
//For conditional operators
        System.out.println("For conditional operator\nEnter first number :");
        a = sc.nextInt();
        System.out.println("Enter Second number :");
        b = sc.nextInt();
        obj.conditional(a,b);
    }
}
