//exception handling 

import java.util.*;

class tmp1
{
	Scanner sc = new Scanner(System.in);

    void input()
    {
	System.out.print("Enter a number to divide: ");
	int no1 = sc.nextInt();

	System.out.print("Enter divider number: ");
	int no2 = sc.nextInt();
        try
	{
		System.out.println(no1/no2);
	}
	catch(Exception e)
	{
		System.out.println("Ivalid operation!");
		System.out.println(e);
		
	}
    }
}

class exception1
{
    public static void main(String k[])
    {
        tmp1 t = new tmp1();
	t.input();
    }
}