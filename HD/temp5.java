class emp
{
    static int a = 10;

    static int input(int a1)
    {
        a = 1;

        for(int i = 1; i <= a1; i++)
        {
            a *= i;
        }

        return a;
    }
}

class temp5
{
    public static void main(String k[])
    {
        emp e = new emp();
        int a1 = e.input(5);
        System.out.println(a1);
    }
}