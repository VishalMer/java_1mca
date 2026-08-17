import java.util.*;
class ATM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter initial balance in your account :");
		double balance = sc.nextDouble();
		boolean isRunning = true;

		while(isRunning)
		{
		System.out.println("Press 1 to check balance");
		System.out.println("Press 2 to Deposit Amount");
		System.out.println("Press 3 to Withdrow Amount");
		System.out.println("Press 4 to Exit");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				System.out.println("Balance in your account is: "+ balance);
			break;

			case 2:
				System.out.print("Enter the amout you want to deposit: ");
				int deposit = sc.nextInt();
				if(deposit < 0){
					System.out.println("Invalid deposit amount");
				}else{
					balance = balance + deposit;
					System.out.println(deposit + "is added to your account. New balance is : "+ balance);
				}
			break;

			case 3:
				System.out.print("Enter the amout you want to withdraw: ");
				int withdraw = sc.nextInt();
				if(withdraw < 0 || withdraw > balance){
					System.out.print("Invalid withdraw amount!");
				}else{
					balance = balance - withdraw;
					System.out.println(withdraw + " is withdrwan from your account. New balance is: "+balance);
				}
			break;
			
			case 4:
				System.out.println("Thank you for using ATM.");
				isRunning = false;
				return;
			
			default:
				System.out.println("Invalid Input!!");

		}
				System.out.println();
		}

	}
}