import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        // 1. Create a LinkedHashSet to represent the train formation
        // This ensures uniqueness + insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in a specific sequence
        System.out.println("--- Attaching Bogies ---");
        addBogie(trainFormation, "Engine");
        addBogie(trainFormation, "Sleeper");
        addBogie(trainFormation, "Cargo");
        addBogie(trainFormation, "Guard");

        // 3. Attempt to attach a duplicate bogie intentionally
        System.out.println("\n--- Attempting Duplicate Attachment ---");
        addBogie(trainFormation, "Sleeper"); // This should be ignored

        // 4. Display the final formation order
        System.out.println("\n--- Final Train Formation ---");
        System.out.println(trainFormation);

        // Demonstrating iteration order
        System.out.print("Physical Sequence: ");
        for (String bogie : trainFormation) {
            System.out.print("[" + bogie + "] -> ");
        }
        System.out.println("END");
    }

    /**
     * Helper method to add a bogie and provide feedback
     */
    private static void addBogie(Set<String> formation, String bogie) {
        if (formation.add(bogie)) {
            System.out.println("Success: Attached " + bogie);
        } else {
            System.out.println("Rejected: " + bogie + " is already attached to the train!");
        }
    }
}