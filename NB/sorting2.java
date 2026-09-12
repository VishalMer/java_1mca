import java.util.*;

class sorting2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int values[] = new int[7];
	int max = values[0];
	int prev = values[0];

        for(int i = 0; i < values.length; i++)
        {
            System.out.print("Enter value no. " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }

	System.out.println();
	System.out.println("The values Entered by you are:");
        for(int i = 0; i < values.length; i++)
        {
		System.out.print(values[i]+" ");
		if(max < values[i])
		{
			prev = max;
			max = values[i];
		}else if(prev <values[i] && values[i] != max){
			prev = values[i];
		}
           
        }
		System.out.println();
		System.out.println("The Maximum is: " +max);
		System.out.println("The second largest is: " +prev);
    }
}