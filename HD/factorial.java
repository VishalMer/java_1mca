import java.util.Scanner;
class factorial
{
	int factorial = 1;
	
	factorial(int a1)
	{
		for(int i=1; i<= a1; i++)
		{
			factorial =factorial * i;
		}
		System.out.println("Print: "+ factorial);
	}
}

class newFactorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
		factorial s1 = new factorial(a);
	}
}