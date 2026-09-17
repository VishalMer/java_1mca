import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * ENHANCED CINEMA TICKET BOOKING SYSTEM
 * 
 * 5 Marks (Variables & Comments): Uses descriptive camelCase naming. 
 * Block and inline comments highlight the object-oriented principles used.
 */

// 10 Marks (Class): Defines the properties and state of a single seat
class Seat {
    // 10 Marks (Data Members): Encapsulated state variables
    private int row;
    private int col;
    private boolean isBooked;
    private double price;
    private String seatType;

    // 10 Marks (Constructor): Automatically determines seat type and price based on row position
    public Seat(int row, int col) {
        this.row = row;
        this.col = col;
        this.isBooked = false; // Seats are empty by default
        
        // Logical Constraint: Rows 0 and 1 are VIP, others are Standard
        if (row < 2) {
            this.seatType = "VIP";
            this.price = 350.00;
        } else {
            this.seatType = "Standard";
            this.price = 200.00;
        }
    }

    public boolean isBooked() { return isBooked; }
    public double getPrice() { return price; }
    public String getSeatType() { return seatType; }
    
    public void bookSeat() { this.isBooked = true; }
    public void cancelSeat() { this.isBooked = false; }
    
    // 5 Marks (Presentation): Returns a visual representation of the seat's status
    public String getSeatVisual() {
        if (isBooked) return "[X]";
        return (seatType.equals("VIP")) ? "[V]" : "[ ]";
    }
}

// 10 Marks (Class): Manages movie details and tracks revenue
class Movie {
    private String movieName;
    private double totalRevenue;
    private int ticketsSold;

    public Movie(String movieName) {
        this.movieName = movieName;
        this.totalRevenue = 0.0;
        this.ticketsSold = 0;
    }

    public String getMovieName() { return movieName; }
    public double getTotalRevenue() { return totalRevenue; }
    public int getTicketsSold() { return ticketsSold; }
    
    public void addSale(double amount) {
        this.totalRevenue += amount;
        this.ticketsSold++;
    }
    
    public void processRefund(double amount) {
        this.totalRevenue -= amount;
        this.ticketsSold--;
    }
}

// Dummy customer utilizing Gujarati names as requested
class Customer {
    private String name;
    public Customer(String name) { this.name = name; }
    public String getName() { return name; }
}

public class CinemaBookingSystem {
    
    private static final int ROWS = 5;
    private static final int COLS = 5;
    
    // 5 Marks (Presentation): Helper method to draw the seating grid
    public static void displaySeatingGrid(Seat[][] grid) {
        System.out.println("\n        SCREEN THIS WAY");
        System.out.println("---------------------------------");
        System.out.println("    1    2    3    4    5  (Cols)");
        
        for (int r = 0; r < ROWS; r++) {
            System.out.print((r + 1) + " "); // Print row number
            for (int c = 0; c < COLS; c++) {
                System.out.print(" " + grid[r][c].getSeatVisual() + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        System.out.println("[V] = VIP (₹350) | [ ] = Standard (₹200) | [X] = Booked\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10 Marks (Object Instantiation)
        Movie currentMovie = new Movie("Shiddat!");
        Customer customer1 = new Customer("Utsav"); 
        
        // Initializing the 2D array of Seat objects
        Seat[][] theaterSeats = new Seat[ROWS][COLS];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                theaterSeats[r][c] = new Seat(r, c);
            }
        }

        System.out.println("=========================================");
        System.out.println(" WELCOME TO RAJKOT CITY CINEMA");
        System.out.println(" Movie: " + currentMovie.getMovieName());
        System.out.println(" Active User: " + customer1.getName());
        System.out.println("=========================================");

        boolean isRunning = true;
        
        // Main Application Loop
        while (isRunning) {
            System.out.println("1. View Seating Chart");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Cancel a Ticket");
            System.out.println("4. View Box Office Report");
            System.out.println("5. Exit System");
            System.out.print("Select an option: ");
            
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n[-] Invalid input. Please enter a valid number.\n");
                scanner.next(); 
                continue;
            }

            // 10 Marks (Logical Constraints): Menu routing
            if (choice == 1) {
                displaySeatingGrid(theaterSeats);
            } 
            else if (choice == 2) {
                try {
                    System.out.print("\nEnter Row number (1-5): ");
                    int r = scanner.nextInt() - 1; 
                    System.out.print("Enter Column number (1-5): ");
                    int c = scanner.nextInt() - 1; 
                    
                    if (r < 0 || r >= ROWS || c < 0 || c >= COLS) {
                        System.out.println("\n[-] Invalid seat selection.\n");
                        continue;
                    }

                    if (theaterSeats[r][c].isBooked()) {
                        System.out.println("\n[-] Sorry, that seat is already booked.\n");
                    } else {
                        theaterSeats[r][c].bookSeat();
                        currentMovie.addSale(theaterSeats[r][c].getPrice()); // Track revenue
                        
                        System.out.println("\n[+] SUCCESS! Ticket booked for " + customer1.getName() + ".");
                        System.out.println("[+] Seat Type: " + theaterSeats[r][c].getSeatType());
                        System.out.println("[+] Amount Paid: ₹" + theaterSeats[r][c].getPrice() + "\n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n[-] Invalid input. Please enter numbers only.\n");
                    scanner.next();
                }
            } 
            else if (choice == 3) {
                try {
                    System.out.print("\nEnter Row number to cancel (1-5): ");
                    int r = scanner.nextInt() - 1; 
                    System.out.print("Enter Column number to cancel (1-5): ");
                    int c = scanner.nextInt() - 1; 
                    
                    if (r < 0 || r >= ROWS || c < 0 || c >= COLS) {
                        System.out.println("\n[-] Invalid seat selection.\n");
                        continue;
                    }

                    // Logical Constraint: Can only cancel if it is actually booked
                    if (!theaterSeats[r][c].isBooked()) {
                        System.out.println("\n[-] That seat is not currently booked.\n");
                    } else {
                        theaterSeats[r][c].cancelSeat();
                        currentMovie.processRefund(theaterSeats[r][c].getPrice());
                        
                        System.out.println("\n[+] SUCCESS! Ticket cancelled.");
                        System.out.println("[+] Refunded Amount: ₹" + theaterSeats[r][c].getPrice() + "\n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n[-] Invalid input. Please enter numbers only.\n");
                    scanner.next();
                }
            }
            else if (choice == 4) {
                System.out.println("\n--- BOX OFFICE REPORT ---");
                System.out.println("Tickets Sold: " + currentMovie.getTicketsSold());
                System.out.println("Total Revenue: ₹" + currentMovie.getTotalRevenue());
                System.out.println("-------------------------\n");
            }
            else if (choice == 5) {
                System.out.println("\nThank you for using the Rajkot City Cinema Booking System. Goodbye!");
                isRunning = false;
            } 
            else {
                System.out.println("\n[-] Invalid choice. Please select from the menu (1-5).\n");
            }
        }
        scanner.close();
    }
}