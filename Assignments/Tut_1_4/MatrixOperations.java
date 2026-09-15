class MatrixOperations 
{
    public static void main(String[] args) 
    {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] prod = new int[2][2];

        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                prod[i][j] = 0;
                for (int k = 0; k < 2; k++) 
                {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplication:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}