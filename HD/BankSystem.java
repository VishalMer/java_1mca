//create a class bank using the concept of exception handling, scanner, //parameterised constructer. consist of data members amount, fixed interest rate = //5.7, grand total. show the result with result function where the output is 

import java.util.*;

class Bank {
    double amount;
    double interestRate = 5.7; 
    double grandTotal;


    Bank(double amount) {
        try {
            if (amount < 0) {
           	 System.out.println("Invalid Input!");
            }
            
            this.amount = amount;
            this.grandTotal = amount + (amount * interestRate / 100);
            
        } catch (Exception e) {
            System.out.println("Invalid operation!");
            System.out.println(e);
        }
    }

    void result() {
        if (amount >= 0) {
            System.out.println("Pricipal  Amount    : " + amount);
            System.out.println("Fixed Interest Rate : " + interestRate + "%");
            System.out.println("Grand Total         : " + grandTotal);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the principal amount to deposit: ");
            double inputAmount = sc.nextDouble();
            
            Bank customerAccount = new Bank(inputAmount);
            
            customerAccount.result();
            
        } catch (Exception e) {
            System.out.println("Please enter a valid numeric amount.");
	}
    }
}