class emp
{
    static int a = 10;

    static int input(int a1)
    {
        a = a1;
        a *= 5;
        return a1;
    }
}

class temp4
{
    public static void main(String k[])
    {
        emp e = new emp();
        int a1 = e.input(10);
        System.out.println(a1);
    }
}