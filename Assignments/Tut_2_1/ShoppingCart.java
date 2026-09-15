import java.util.Scanner;

class Product 
{
    String productId;
    String productName;
    double price;
    String category;
    int quantity;
    double totalAmount;
    double discount;
    double gst;
    double finalAmount;

    Product(String pId, String pName, double pPrice, String pCategory) 
    {
        productId = pId;
        productName = pName;
        price = pPrice;
        category = pCategory;
    }

    void processCart(String argCategory) 
    {
        if (category.equals(argCategory)) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter quantity for " + productName + ": ");
            quantity = sc.nextInt();

            totalAmount = price * quantity;
            discount = totalAmount * 0.05;
            double amountAfterDiscount = totalAmount - discount;
            gst = amountAfterDiscount * 0.18;
            finalAmount = amountAfterDiscount + gst;
        }
    }

    void display() 
    {
        System.out.println("Product: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Discount (5%): " + discount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}

class ShoppingCart 
{
    public static void main(String args[]) 
    {
        if (args.length > 0) 
        {
            Product pr1 = new Product("PR001", "Khaman", 250.0, "Farsan");
            pr1.processCart(args[0]);
            pr1.display();
        }
    }
}