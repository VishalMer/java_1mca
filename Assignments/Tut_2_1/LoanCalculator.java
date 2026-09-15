import java.util.Scanner;

class Loan 
{
    String customerId;
    String customerName;
    double loanAmount;
    double interestRate;
    int tenureMonths;
    double emi;
    double totalRepayment;

    Loan(String cId, String cName, double amount, double rate) 
    {
        customerId = cId;
        customerName = cName;
        loanAmount = amount;
        interestRate = rate;
    }

    void calculateEMI(String argCustomerId) 
    {
        if (customerId.equals(argCustomerId)) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter loan tenure in months: ");
            tenureMonths = sc.nextInt();

            double r = interestRate / (12 * 100);
            emi = (loanAmount * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
            totalRepayment = emi * tenureMonths;
        }
    }

    void display() 
    {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Tenure (Months): " + tenureMonths);
        System.out.println("Monthly EMI: " + emi);
        System.out.println("Total Repayment Amount: " + totalRepayment);
    }
}

class LoanCalculator 
{
    public static void main(String args[]) 
    {
        if (args.length > 0) 
        {
            Loan l1 = new Loan("90", "Jignesh Desai", 500000.0, 9.5);
            l1.calculateEMI(args[0]);
            l1.display();
        }
    }
}