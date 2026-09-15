import java.util.Scanner;

class JaggedArrayBasic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print("Enter value for row " + i + " col " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}