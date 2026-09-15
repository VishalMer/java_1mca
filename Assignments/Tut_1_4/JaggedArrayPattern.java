class JaggedArrayPattern 
{
    public static void main(String[] args) 
    {
        int[][] arr = new int[4][];
        
        for (int i = 0; i < 4; i++) 
        {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) 
            {
                arr[i][j] = j + 1;
            }
        }

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