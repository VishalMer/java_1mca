import java.util.*;

class sorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int values[] = new int[7];

        for(int i = 0; i < values.length; i++)
        {
            System.out.print("Enter value no. " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }

        for(int i = 0; i < values.length; i++)
        {

            for(int j = i + 1; j < values.length; j++)
            {
                if(values[i] > values[j])
                {
                    values[i] = values[i] + values[j];
                    values[j] = values[i] - values[j];
                    values[i] = values[i] - values[j];

                }
            }

        }

        System.out.println();
        System.out.println("Sorted values are:");

        for(int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
    }
}