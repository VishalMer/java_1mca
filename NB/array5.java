import java.util.*;
class array5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int values[] = new int[7];


		for(int i = 0; i< values.length; i++)
		{
			System.out.print("Enter value no. "+(i+1 )+": ");
			values[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("The values Entered by you are:");
		for(int i = 0; i< values.length; i++)
		{
			System.out.println(values[i]+" ");
		}

	}
}