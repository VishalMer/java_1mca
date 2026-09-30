//create a class banckAccount with members(actNo, acHolderName, balance)

import java.util.*;

class bankAccount
{
	String acNo;
	String acHoldername;
	private double balance;
	Scanner sc = new Scanner(System.in);

	bankAccount(String acNo, String acHoldername, double balance)
	{
		this.acNo = acNo;
		this.acHoldername = acHoldername;
		this.balance = balance;
	}
	void deposite()
	{
		System.out.print("Enter amount for deposite in "+acHoldername+"'s account: ");
		double amount = sc.nextDouble();
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposite of "+ amount +" succeed!");
			System.out.println("New balance: "+balance);
			System.out.println();
		}else{
			System.out.println("Invalid balance!");
			System.out.println();
		}
	}
	void withdraw()
	{
		System.out.print("Enter amount for withdraw from "+acHoldername+"'s account: ");
		double amount = sc.nextDouble();
		if(amount > 0 && amount < balance)
		{
			balance -= amount;
			System.out.println("Withdraw of "+ amount +" succeed!");
			System.out.println("New balance: "+balance);
			System.out.println();
		}else{
			System.out.println("Insufficient balance or invalid input!");
			System.out.println();
		}
	}

	double getBalance(){
		return balance;
	}
	String getName(){
		return acHoldername;
	}
	String getacNo(){
		return acNo;
	}
	
	void setBalance(double bal){ balance = bal}


	void displayInfo()
	{
		System.out.println("Account no is " + acNo);
		System.out.println("Account holder name is " + acHoldername);
		System.out.println("Account's balance is " + balance);
		System.out.println();
	}
}
class demoAccount
{
	public static void main(String []args)
	{
		bankAccount b1= new bankAccount("1233", "Rahul", 3000);
		bankAccount b2= new bankAccount("1234", "Vishal", 3000);
		b1.setBalance(300);
		b1.displayInfo();
		b2.displayInfo();
		//b1.deposite();
		b1.withdraw();
		//b2.deposite();
		b2.withdraw();
		//System.out.println("Current balance: "+b1.getBalance());
		//System.out.println("Name of account holder: "+b1.getName());
		//System.out.println(": "+b1.getBalance());

		if(b1.getBalance() > b2.getBalance()){
			System.out.println(b1.getName()+" has "+b1.getBalance()+" which is more than "+b2.getName()+".");
		}else{
			System.out.println(b2.getName()+" has "+b2.getBalance()+" which is more than "+b1.getName()+".");
		}
	}
}