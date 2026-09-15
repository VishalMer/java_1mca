class JaggedArrayMax 
{
    public static void main(String[] args) 
    {
        int[][] arr = {
            {12, 45},
            {9, 88, 34},
            {56, 99, 21, 10}
        };
        
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if (arr[i][j] > max) 
                {
                    max = arr[i][j];
                }
            }
        }
        
        System.out.println("Maximum element in the jagged array: " + max);
    }
}