import java.util.*;
class paniPuri
{
	public static void main(String args[])
	{
		int psCount[] = new int[10];
		int total = 0;
		int avgCount = 0;
		int minimum = psCount[0];
		int maximum = psCount[0];
		float avg = total/psCount.length;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the count of PP you ate in last 10 times: ");
		for(int i = 0; i< psCount.length; i++)
		{
			psCount[i] = sc.nextInt();
		}

		System.out.println("Count of last 10 times PP you ate: ");
		for(int i = 0; i< psCount.length; i++)
		{
			System.out.print(psCount[i]+" ");
			if(minimum > psCount[i])
			{
				minimum = psCount[i];
			}

			if(maximum < psCount[i])
			{
				maximum = psCount[i];
			}
			total += psCount[i];
		}

		for(int i = 0; i< psCount.length; i++)
		{
			if(psCount[i] > avg)
			avgCount++;
		}

		System.out.println();
		System.out.println("Maximum PP count is: "+ maximum);
		System.out.println("Minimum PP count is: "+ minimum);
		System.out.println("Total PP count is: "+ total);
		System.out.println("Avrage PP count is: "+ total);
		System.out.println(avgCount+" times you ate more PP than average.");
	}
}