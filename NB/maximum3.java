import java.util.*;
class maximum3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();

		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();

		System.out.print("Enter number 3: ");
		int num3 = sc.nextInt();
		
		System.out.println();

		if (num1>num2){
			if(num1>num3){
			System.out.println(num1+" is Greater.");
			}else{
			System.out.println(num3+" is Greater.");
			}						
		}else{
			if(num2>num3){
			System.out.println(num2+" is Greater.");
			}else{
			System.out.println(num3+" is Greater");
			}
		}
	}		
}