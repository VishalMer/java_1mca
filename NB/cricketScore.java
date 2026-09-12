/*
Enter last 10 scores by virat kohli in odi.
1.Find higest score
2.Find lowest score
3.Find no of 50s
4.Find no of 100s
5.Find is any match is he out in 0.
*/

import java.util.Scanner;
class cricketScore
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[10];
		int cntf=0,cnth=0,cntz=0;
		System.out.println("Enter 10 Score:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>=50 && arr[i]<100)
			{
				cntf++;
			}
			else if(arr[i]>=100)
			{
				cnth++;
			}
			else if(arr[i]==0)
			{
				cntz++;
			}
		}
		System.out.print("All Score:");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();

		int high=arr[0];
		for(int i:arr)
		{
			if(i>high)
				high=i;
		}


		int low=arr[0];
		for(int i:arr)
		{
			if(i<low)
				low=i;
		}
		System.out.println("Higest Score is  : "+high);
		System.out.println("Lowest Score is  : "+low);
		System.out.println("50s  is  : "+cntf);
		System.out.println("100s is  : "+cnth);
		if(cntz==0)
		{
			System.out.println("Never out at 0");
		}
		else
		{
			System.out.println("Out at 0 runs "+cntz+" time's");
		}
	}
}