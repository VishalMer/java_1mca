import java.util.*;

class arr2
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		int max = arr[0];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 elems: ");

		for(int i = 0; i<arr.length; i++)
		//for(ele:arr)
		{
			arr[i] = sc.nextInt();
		}
			System.out.println();

		System.out.println("Array elems are: ");
		for(int i = 0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
			System.out.println();
			System.out.print("Max is: "+max);
	}
}