import java.util.Scanner;

public class Banking
{
	int balance = 0;
	public void deposit()
	{
		int a=1;
		while(a == 1)
		{
			int Dmount;
			System.out.println("Enter amount to deposit :");
			Scanner sc = new Scanner(System.in);
			Dmount = sc.nextInt();
			balance = balance+Dmount;
			System.out.println("Enter 1 to continue or any number to exit:");
			a = sc.nextInt();
			
			if(a==1)
			{
				continue;
			}
			else
			{
				System.out.println("Balance is Rs"+balance+"/-");
				System.out.println("Thank you for banking with us:)");
				break;
			}							
			
		}
	}
	public void withdraw()
	{
		int Wdmount;
		int b = 1;
		while(b == 1)
		{
			System.out.println("Enter amount to withdraw :");
			Scanner sc = new Scanner(System.in);
			Wdmount = sc.nextInt();
			if(Wdmount <= balance)
			{
				balance = balance-Wdmount;
			}
			else
			{
				System.out.println("Balance is not enough.");
			}
			System.out.println("Press 1 to continue or any number to exit:");
			b = sc.nextInt();
			if(b==1)
			{
				continue;
			}
			else{
				System.out.println("Balance is "+balance+"\nThank you for banking with us:)");
				break;
			}
		}
	}
	public static void main(String args[]) throws Exception
	{
		int func;
		Banking obj = new Banking();

		String userId = "user01";
		String pswd = "pswd01";
		String userId_input;
		String pswd_input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id :");
		userId_input = sc.nextLine();
		System.out.println("Enter password :");
		pswd_input = sc.nextLine();
		for(int i=0;i<4;i++) {
			if (userId_input.equals(userId) && pswd_input.equals(pswd)) {
				System.out.println("press 1 for deposit , 2 for withdraw:");
				func = sc.nextInt();
				switch (func) {
					case 1:
						obj.deposit();
						break;
					case 2:
						obj.withdraw();
						break;
					default:System.out.println("Press correct key.");
					continue;
				}
				break;
			}
			else
			{
				System.out.println("Incorrect user id or password.");
				continue;
			}
		}
	}
}
