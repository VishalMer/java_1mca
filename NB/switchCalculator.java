import java.util.*;
class switchCalculator
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans=0;

		System.out.println("Select the operation:");
		System.out.println("Select '+' for Addition");
		System.out.println("Select '-' for Subtraction");
		System.out.println("Select '*' for Multiplication");
		System.out.println("Select '/' for Division");

		System.out.println("Enter your choice : ");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
			case '+':
				ans = a+b;
				System.out.println("Addition is : " + ans);
			break;

			case '-':
				ans = a-b;
				System.out.println("Subtraction is : " + ans);
			break;

			case '*':
				ans = a*b;
				System.out.println("Multiplication is : " + ans);
			break;

			case '/':
				ans = a/b;
				System.out.println("Division is : " + ans);
			break;
			
			default:
				System.out.println("Invalid input");

		}

	}

}