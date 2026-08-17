import java.util.Scanner;
class square
{
	square()
	{
		System.out.println("Program of square");
	}
	
	square(int a1)
	{
		System.out.println("Square:"+ a1*a1);
	}
}

class t1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
		square s1 = new square(a);
	}
}