//exception handling 

import java.util.*;

class tmp2
{
	Scanner sc = new Scanner(System.in);

    void input()
    {
	int arr[] = new int[5];

        try
	{
		arr[6] = 12;
	}
	catch(Exception e)
	{
		System.out.println("Ivalid!");
		System.out.println(e);
		
	}
    }
}

class exception2
{
    public static void main(String k[])
    {
        tmp2 t = new tmp2();
	t.input();
    }
}