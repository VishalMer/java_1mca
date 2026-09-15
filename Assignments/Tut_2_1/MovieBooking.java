import java.util.Scanner;

class Movie 
{
    String movieId;
    String movieName;
    double ticketPrice;
    int availableSeats;
    int ticketsToBook;
    double totalCost;

    Movie(String mId, String mName, double price, int seats) 
    {
        movieId = mId;
        movieName = mName;
        ticketPrice = price;
        availableSeats = seats;
    }

    void processBooking(String argMovieId) 
    {
        if (movieId.equals(argMovieId)) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of tickets to book: ");
            ticketsToBook = sc.nextInt();
            
            if (ticketsToBook <= availableSeats) 
            {
                totalCost = ticketsToBook * ticketPrice;
                if (ticketsToBook > 3) 
                {
                    totalCost = totalCost - (totalCost * 0.10);
                }
                availableSeats = availableSeats - ticketsToBook;
            } 
            else 
            {
                System.out.println("Not enough seats available.");
            }
        }
    }

    void display() 
    {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Tickets Booked: " + ticketsToBook);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Remaining Seats: " + availableSeats);
    }
}

class MovieBooking 
{
    public static void main(String args[]) 
    {
        if (args.length > 0) 
        {
            Movie m1 = new Movie("M101", "Chhello Divas", 200.0, 150);
            m1.processBooking(args[0]);
            m1.display();
        }
    }
}