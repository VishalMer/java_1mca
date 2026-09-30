//exception handling 

import java.util.*;

class tmp3
{
	Scanner sc = new Scanner(System.in);

    tmp3(int a)
    {
        try
	{
		System.out.println(a/0);
	}
	catch(Exception e)
	{
		System.out.println("Ivalid operation!");
		System.out.println(e);
		
	}
    }
}

class exception3
{
    public static void main(String k[])
    {
        tmp3 t = new tmp3(3);

    }
}