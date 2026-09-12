import java.util.*;

class supplimentory
{ 
	int limit;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter supplimentory limit: ");
		limit = sc.nextInt();

	}

	void display()
	{
		System.out.println("");
		System.out.println("The limit is: "+limit);

	}
}

class supply
{
	public static void main(String args[])
	{
		supplimentory s1 = new supplimentory();
		s1.input();
		s1.display();
	}
}