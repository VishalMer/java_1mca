import java.util.Scanner;

public class restMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        int subChoice = 0;
        int quantity = 0;
        double totalBill = 0;
        boolean order = true;

        while (order)
        {

            System.out.println("Select from Main Menu");
            System.out.println("Press 1 for Starter");
            System.out.println("Press 2 for Main Course");
            System.out.println("Press 3 for Dessert");
            System.out.println("Press 4 for Bill Generation");

            System.out.print("Enter Choice (1-4): ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("\n--------- STARTER ---------");
                    System.out.println("1. French Fries     - Rs. 100");
                    System.out.println("2. Garlic Bread     - Rs. 120");
                    System.out.println("3. Paneer Tikka     - Rs. 180");

                    System.out.print("Enter Sub Choice: ");
                    subChoice = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    switch (subChoice)
                    {
                        case 1:
                            totalBill = totalBill + (100 * quantity);
                            System.out.println("French Fries added.");
                            break;

                        case 2:
                            totalBill = totalBill + (120 * quantity);
                            System.out.println("Garlic Bread added.");
                            break;

                        case 3:
                            totalBill = totalBill + (180 * quantity);
                            System.out.println("Paneer Tikka added.");
                            break;

                        default:
                            System.out.println("Invalid Starter Choice!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n--------- MAIN COURSE ---------");
                    System.out.println("1. Pizza            - Rs. 250");
                    System.out.println("2. Burger           - Rs. 180");
                    System.out.println("3. Paneer Butter    - Rs. 220");

                    System.out.print("Enter Sub Choice: ");
                    subChoice = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    switch (subChoice)
                    {
                        case 1:
                            totalBill = totalBill + (250 * quantity);
                            System.out.println("Pizza added.");
                            break;

                        case 2:
                            totalBill = totalBill + (180 * quantity);
                            System.out.println("Burger added.");
                            break;

                        case 3:
                            totalBill = totalBill + (220 * quantity);
                            System.out.println("Paneer Butter added.");
                            break;

                        default:
                            System.out.println("Invalid Main Course Choice!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n--------- DESSERT ---------");
                    System.out.println("1. Ice Cream        - Rs. 80");
                    System.out.println("2. Gulab Jamun      - Rs. 100");
                    System.out.println("3. Brownie          - Rs. 120");

                    System.out.print("Enter Sub Choice: ");
                    subChoice = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    switch (subChoice)
                    {
                        case 1:
                            totalBill = totalBill + (80 * quantity);
                            System.out.println("Ice Cream added.");
                            break;

                        case 2:
                            totalBill = totalBill + (100 * quantity);
                            System.out.println("Gulab Jamun added.");
                            break;

                        case 3:
                            totalBill = totalBill + (120 * quantity);
                            System.out.println("Brownie added.");
                            break;

                        default:
                            System.out.println("Invalid Dessert Choice!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Total Bill = Rs. " + totalBill);
                    System.out.println("Thank You for Visiting My Cafe!");
                    

                    order = false;
                    break;

                default:
                    System.out.println("Invalid Choice! Please enter 1 to 4.");
                    break;
            }
        }

        
    }
}