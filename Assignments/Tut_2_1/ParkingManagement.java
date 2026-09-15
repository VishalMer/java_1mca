import java.util.Scanner;

class Vehicle 
{
    String vehicleNumber;
    String ownerName;
    String vehicleType;
    double parkingRate;
    int hoursParked;
    double parkingFee;

    Vehicle(String vNum, String oName, String vType, double rate) 
    {
        vehicleNumber = vNum;
        ownerName = oName;
        vehicleType = vType;
        parkingRate = rate;
    }

    void calculateFee(String argVehicleNumber) 
    {
        if (vehicleNumber.equals(argVehicleNumber)) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter hours parked: ");
            hoursParked = sc.nextInt();

            if (vehicleType.equalsIgnoreCase("Car")) 
            {
                parkingFee = hoursParked * parkingRate * 1.5;
            } 
            else if (vehicleType.equalsIgnoreCase("Bike")) 
            {
                parkingFee = hoursParked * parkingRate;
            } 
            else 
            {
                parkingFee = hoursParked * parkingRate * 2.0;
            }
        }
    }

    void display() 
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Hours Parked: " + hoursParked);
        System.out.println("Total Parking Fee: " + parkingFee);
    }
}

class ParkingManagement 
{
    public static void main(String args[]) 
    {
        if (args.length > 0) 
        {
            Vehicle v1 = new Vehicle("6772", "Chetan Chauhan", "Car", 20.0);
            v1.calculateFee(args[0]);
            v1.display();
        }
    }
}