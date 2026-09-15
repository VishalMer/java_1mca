class PrimeInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 5, 7, 19, 24, 31, 40, 43, 50, 53};
        
        for (int i = 0; i < arr.length; i++) 
        {
            int c = 0;
            for (int j = 1; j <= arr[i]; j++) 
            {
                if (arr[i] % j == 0) 
                {
                    c++;
                }
            }
            if (c == 2) 
            {
                System.out.println(arr[i]);
            }
        }
    }
}