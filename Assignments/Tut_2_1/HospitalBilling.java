import java.util.Scanner;

class Patient 
{
    String patientId;
    String patientName;
    int age;
    double consultationFee;
    int daysAdmitted;
    double roomChargesPerDay;
    double medicineExpenses;
    double totalBill;

    Patient(String pId, String pName, int pAge, double cFee) 
    {
        patientId = pId;
        patientName = pName;
        age = pAge;
        consultationFee = cFee;
    }

    void calculateBill(String argPatientId) 
    {
        if (patientId.equals(argPatientId)) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of days admitted: ");
            daysAdmitted = sc.nextInt();
            
            System.out.print("Enter room charges per day: ");
            roomChargesPerDay = sc.nextDouble();
            
            System.out.print("Enter medicine expenses: ");
            medicineExpenses = sc.nextDouble();

            totalBill = consultationFee + (daysAdmitted * roomChargesPerDay) + medicineExpenses;
        }
    }

    void display() 
    {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Total Hospital Bill: " + totalBill);
    }
}

class HospitalBilling 
{
    public static void main(String args[]) 
    {
        if (args.length > 0) 
        {
            Patient p1 = new Patient("P505", "Bhavesh Patel", 45, 500.0);
            p1.calculateBill(args[0]);
            p1.display();
        }
    }
}