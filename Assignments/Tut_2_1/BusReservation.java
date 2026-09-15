import java.util.Scanner;

class Bus 
{
    String busNumber;
    String source;
    String destination;
    double ticketPrice;
    int availableSeats;
    String passengerName;
    int seatsRequired;
    double totalAmount;

    Bus(String bNum, String src, String dest, double price, int seats) 
    {
        busNumber = bNum;
        source = src;
        destination = dest;
        ticketPrice = price;
        availableSeats = seats;
    }

    void processReservation(String argBusNumber) 
    {
        if (busNumber.equals(argBusNumber)) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter passenger name: ");
            passengerName = sc.nextLine();
            
            System.out.print("Enter number of seats required: ");
            seatsRequired = sc.nextInt();

            if (seatsRequired <= availableSeats) 
            {
                totalAmount = seatsRequired * ticketPrice;
                availableSeats = availableSeats - seatsRequired;
            } 
            else 
            {
                System.out.println("Required seats are not available.");
            }
        }
    }

    void display() 
    {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Route: " + source + " to " + destination);
        System.out.println("Seats Booked: " + seatsRequired);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Available Seats Left: " + availableSeats);
    }
}

class BusReservation 
{
    public static void main(String args[]) 
    {
        if (args.length > 0) 
        {
            Bus b1 = new Bus("62", "Rajkot", "Surat", 650.0, 42);
            b1.processReservation(args[0]);
            b1.display();
        }
    }
}