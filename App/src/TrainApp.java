import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize the Train Consist Management App
 */
import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {
        // 1. Create an ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        System.out.println("--- Train Formation Started ---");

        // 2. Add bogies: Sleeper, AC Chair, First Class
        // The add() method demonstrates Insertion Order Preservation
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Current Bogies: " + bogies);

        // 4. Remove one bogie (AC Chair)
        // This demonstrates the 'Delete' part of CRUD
        System.out.println("\nRemoving 'AC Chair' for maintenance...");
        bogies.remove("AC Chair");

        // 5. Use contains() to check if Sleeper exists
        System.out.println("Checking existence of 'Sleeper'...");
        if (bogies.contains("Sleeper")) {
            System.out.println("Status: Sleeper bogie is attached to the train.");
        } else {
            System.out.println("Status: Sleeper bogie not found.");
        }

        // 6. Print final list state
        System.out.println("\nFinal Train State: " + bogies);
        System.out.println("Total Bogies: " + bogies.size());
    }
}