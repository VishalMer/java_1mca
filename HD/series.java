import java.util.Scanner;

class series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for series: ");
		int number = sc.nextInt();
		int n1 = 0;
		

		for(int i = 0; i<number; i++){
			n1 += 10;
			System.out.print(n1+" ");

		}

		System.out.println();
		System.out.println("Reverse is: ");
		for(int i = 0; i<number; i++){
			System.out.print(n1+" ");
			n1 -= 10;

		}
	}
}