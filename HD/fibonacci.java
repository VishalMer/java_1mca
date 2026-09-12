import java.util.Scanner;

class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for fibonacci: ");
		int number = sc.nextInt();
		int prev = 0, next = 0, current=1;

		for(int i = 0; i<number; i++){

			System.out.print(prev+" ");

			next = current + prev;
			prev = current;
			current = next;

		}
	}
}