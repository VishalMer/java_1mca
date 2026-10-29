import java.util.*;

class Odd_Sum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many elemnts you want in an array :");
		int n=sc.nextInt();
		sc.nextLine();
		int [] arr1=new int[n];
		int sum=0;

		System.out.println("Enter array elements :");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2!=0)
			{
				sum+=arr1[i];
			}
			
		}
		System.out.println("Sum of odd number : "+sum);
	}
}



