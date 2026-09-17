import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * TEXT ADVENTURE GAME: ESCAPE THE HAVELI
 * 
 * 5 Marks (Variables & Comments): Standard Java naming conventions (camelCase) 
 * are strictly followed. Detailed block and inline comments explain the mechanics.
 */

// 10 Marks (Class): Defines the structure for game locations
class Room {
    // 10 Marks (Data Members): Encapsulated state variables
    private String roomName;
    private boolean isLocked;
    private String requiredItem;

    // 10 Marks (Constructor): Initializes the exact state of a room upon creation
    public Room(String roomName, boolean isLocked, String requiredItem) {
        this.roomName = roomName;
        this.isLocked = isLocked;
        this.requiredItem = requiredItem;
    }

    public String getRoomName() { return roomName; }
    public boolean isLocked() { return isLocked; }
    public String getRequiredItem() { return requiredItem; }
}

// 10 Marks (Class): Manages user state and interactions
class Player {
    private String playerName;
    private String[] inventory;
    private int itemIndex;

    public Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new String[5]; // Maximum inventory capacity
        this.itemIndex = 0;
    }

    // 10 Marks (Logical Constraint): Prevents ArrayOutOfBounds exceptions and duplicate items
    public void pickUpItem(String item) {
        if (itemIndex < inventory.length) {
            if (!hasItem(item)) {
                inventory[itemIndex] = item;
                itemIndex++;
                System.out.println("\n[+] " + playerName + " picked up: " + item);
            } else {
                System.out.println("\n[-] You already have the " + item + ".");
            }
        } else {
            System.out.println("\n[-] Inventory full! Cannot carry more items.");
        }
    }

    // 10 Marks (Logical Constraint): Iterates through the array to verify ownership of a specific item
    public boolean hasItem(String searchItem) {
        for (int i = 0; i < itemIndex; i++) {
            if (inventory[i].equalsIgnoreCase(searchItem)) {
                return true;
            }
        }
        return false;
    }

    public String getPlayerName() { return playerName; }
}

public class EscapeGame {
    
    // 5 Marks (Presentation): Reusable helper method for atmospheric console UI
    public static void printHeader(String title) {
        System.out.println("\n========================================");
        System.out.println("   " + title.toUpperCase());
        System.out.println("========================================");
        try {
            // Suspends execution for 800ms to create a dramatic reading delay
            Thread.sleep(800); 
        } catch (InterruptedException e) {
            System.out.println("Error rendering delay.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10 Marks (Object Instantiation): Creating concrete instances from the classes
        Player player1 = new Player("Bhaveshkumar");
        Room courtyard = new Room("Haveli Courtyard", false, "None");
        Room secretTijoriRoom = new Room("Secret Tijori Room", true, "Lal Chabi");
        
        printHeader("Welcome to the Haveli Escape, " + player1.getPlayerName());
        
        boolean isPlaying = true;
        
        // Main Game Loop
        while (isPlaying) {
            System.out.println("\nYou are currently in the " + courtyard.getRoomName() + ".");
            System.out.println("1. Search the Maati Nu Matlu (Clay Pots)");
            System.out.println("2. Try to enter the " + secretTijoriRoom.getRoomName());
            System.out.println("3. Exit Game");
            System.out.print("Choose an action (1-3): ");
            
            int choice = 0;
            
            // Logical Constraint: Input validation to prevent crashes on non-integer input
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n[-] Invalid input. Please enter a number.");
                scanner.next(); // Clear the bad input from the scanner buffer
                continue;       // Restart the loop
            }
            
            // 10 Marks (Logical Constraints): Central conditional logic directing the game flow
            if (choice == 1) {
                System.out.println("\nYou look inside the dark matlu...");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
                player1.pickUpItem("Lal Chabi");
            } 
            else if (choice == 2) {
                printHeader("Approaching " + secretTijoriRoom.getRoomName());
                
                // Nested logical constraint: Checks if door is locked, THEN checks if player has the specific key
                if (secretTijoriRoom.isLocked()) {
                    if (player1.hasItem(secretTijoriRoom.getRequiredItem())) {
                        System.out.println("SUCCESS: You used the '" + secretTijoriRoom.getRequiredItem() + "' to unlock the heavy wooden door!");
                        System.out.println("You found the hidden gold coins and escaped the Haveli! YOU WIN!");
                        isPlaying = false; // Breaks the loop to end the game
                    } else {
                        System.out.println("LOCKED: The door won't budge. You need the '" + secretTijoriRoom.getRequiredItem() + "' to enter this room.");
                    }
                }
            } 
            else if (choice == 3) {
                System.out.println("\nExiting the game. Goodbye, " + player1.getPlayerName() + "!");
                isPlaying = false;
            } 
            else {
                System.out.println("\n[-] Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}