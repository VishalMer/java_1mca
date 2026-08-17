import java.util.*;
class searchEle
{
	public static void main(String args[])
	{
		int elements[] = new int[10];
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 10 numbers: ");
		for(int i = 0; i< elements.length; i++)
		{
			elements[i] = sc.nextInt();
		}

		System.out.println("Enter the number you want to search: ");
		int search = sc.nextInt();

		for(int i = 0; i< elements.length; i++)
		{
			if(search == elements[i])
			{
				count++;
			}
		}

		System.out.println();
		System.out.println("In the array "+search+" found "+count+" times.");
	}
}