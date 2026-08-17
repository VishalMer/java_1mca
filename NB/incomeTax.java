import java.util.*;
class taxCalculator
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter amount: ");
		double income = sc.nextDouble();
		double tax = 0;

		if( income > 0 && income <= 300000){
			tax = 0;

		}else if (income > 300000 && income >= 500000){
			tax = ((income - 300000) * 0.05);
		}else if(income > 500000 && income >= 1000000){
			tax = ((200000 * 0.05) + (income - 500000) * 0.1);
		}else if(income > 1000000 && income >= 2000000){
			tax = ((200000 * 0.05) + (500000 * 0.1) + (income - 1000000) * 0.2);
		}else{
			tax = ((200000 * 0.05) + (500000 * 0.1) + (1000000 * 0.2) + (income - 1000000) * 0.3);
		}
		System.out.print("Your payable tax amount is: "+tax);

	}
}
