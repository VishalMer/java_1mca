import java.util.*;
class scanner
{
	public static void main(String v[])
	{
		int n=Integer.parseInt(v[0]);

		Scanner s1= new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = s1.nextLine();
		

		System.out.print("Enter Roll: ");
		int roll = s1.nextInt();
		
		System.out.println();
		System.out.println("Name: "+ name);
		System.out.println("Roll no: "+ roll);

		if (n%2 == 0){
			System.out.println(n+" is even");
		}else{
			System.out.println(n+" is Odd");
		}

	}		
}