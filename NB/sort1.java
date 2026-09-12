import java.util.*;

class sort1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int values[] = new int[7];
        int newArray[] = new int[7];

        for(int i = 0; i < values.length; i++)
        {
            System.out.print("Enter value no. " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("The values entered by you are:");

        for(int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }

        // Sorting
        for(int i = 0; i < values.length; i++)
        {
            int min = values[i];
            int minIndex = i;

            for(int j = i + 1; j < values.length; j++)
            {
                if(min > values[j])
                {
                    min = values[j];
                    minIndex = j;
                }
            }

            // Put minimum value into newArray
            newArray[i] = min;

            // Swap minimum with current value
            int temp = values[i];
            values[i] = values[minIndex];
            values[minIndex] = temp;
        }

        System.out.println();
        System.out.println("Sorted values are:");

        for(int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
}