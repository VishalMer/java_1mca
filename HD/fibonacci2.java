import java.util.Scanner;

class fibonacci2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for fibonacci: ");
		int number = sc.nextInt();
		int prev = 0, next = 0, current=1, s_prev = 0;

		for(int i = 0; i<number; i++){



			next = current + prev + s_prev;
			s_prev = prev;
			prev = current;
			current = next;
			System.out.print(s_prev+" ");

		}
	}
}