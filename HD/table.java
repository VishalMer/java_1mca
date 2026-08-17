import java.util.Scanner;
class table
{
	
	table(int a1)
	{
		for(int i=1; i<= 10; i++)
		{
			System.out.println(a1 +" * "+ i +" = "+ a1*i);
		}
	}
}

class newTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
		table s1 = new table(a);
	}
}