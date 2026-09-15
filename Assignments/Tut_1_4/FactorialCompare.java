import java.util.Scanner;

class FactorialCompare 
{
    static int factRec(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        }
        return n * factRec(n - 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int factLoop = 1;
        for (int i = 1; i <= n; i++) 
        {
            factLoop *= i;
        }
        
        int factRecursive = factRec(n);
        
        System.out.println("Factorial using Loop: " + factLoop);
        System.out.println("Factorial using Recursion: " + factRecursive);
    }
}