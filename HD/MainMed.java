// create a class medical which is having 3 fields medicine name, size of the doze, medicine ID, medical store, quantity, price, use the concept of scanner class, deep copy constructer and show the out put 

import java.util.Scanner;

class Medical {
    String medicineName;
    String doseSize;
    int medicineID;
    String medicalStore;
    int quantity;
    double price;


    Medical() {
    }


    Medical(String medicineName, String doseSize, int medicineID,
            String medicalStore, int quantity, double price) {
        this.medicineName = medicineName;
        this.doseSize = doseSize;
        this.medicineID = medicineID;
        this.medicalStore = medicalStore;
        this.quantity = quantity;
        this.price = price;
    }

    Medical(Medical m) {
        this.medicineName = new String(m.medicineName);
        this.doseSize = new String(m.doseSize);
        this.medicineID = m.medicineID;
        this.medicalStore = new String(m.medicalStore);
        this.quantity = m.quantity;
        this.price = m.price;
    }

    void display() {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Dose Size     : " + doseSize);
        System.out.println("Medicine ID   : " + medicineID);
        System.out.println("Medical Store : " + medicalStore);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : " + price);
    }
}

class MainMed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Dose Size: ");
        String dose = sc.nextLine();

        System.out.print("Enter Medicine ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medical Store: ");
        String store = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Medical m1 = new Medical(name, dose, id, store, quantity, price);

        Medical m2 = new Medical(m1);

        System.out.println("\nOriginal Medical Details:");
        m1.display();

        System.out.println("\nDeep Copy Medical Details:");
        m2.display();

    }
}