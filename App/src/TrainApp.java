import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        // Step 1: Initialize the HashSet (Set Interface implementation)
        Set<String> trainBogies = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Train Bogie Management System ---");
        System.out.println("Enter Bogie IDs (Type 'done' to finish):");

        while (true) {
            System.out.print("Enter Bogie ID: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            // Step 2 & 3: Insert into HashSet.
            // The add() method returns false if the element already exists.
            boolean isAdded = trainBogies.add(input);

            if (isAdded) {
                System.out.println("Bogie " + input + " added successfully.");
            } else {
                System.out.println("Duplicate Bogie! " + input + " ignored.");
            }
        }

        // Step 4: Display Unique IDs
        System.out.println("\n--- Final Train Composition ---");
        System.out.println("Total Unique Bogies: " + trainBogies.size());
        System.out.println("Bogie List: " + trainBogies);

        scanner.close();
    }
}