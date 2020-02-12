import java.util.Scanner;
public class OperationsWithConstructor {
    public OperationsWithConstructor()
    {
        int a,b,c;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("Enter Second number :");
        b = sc.nextInt();
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
    public OperationsWithConstructor(int i,int j){
        System.out.println("Greatest among two numbers.");
        if(i>j){
            System.out.println(i+" is greater than "+j+".");
        }
        else{
            System.out.println(j+" is greater than "+i+".");
        }
    }
    public static void main(String args[]){
        System.out.println("Using constructor.");
        int a,b;
        OperationsWithConstructor obj1 = new OperationsWithConstructor();
//For conditional operators
        Scanner sc  = new Scanner(System.in);
        System.out.println("For conditional operator\nEnter first number :");
        a = sc.nextInt();
        System.out.println("Enter Second number :");
        b = sc.nextInt();
        OperationsWithConstructor obj2 = new OperationsWithConstructor(a,b);

    }
}
