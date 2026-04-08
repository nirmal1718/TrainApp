import java.util.LinkedList;
import java.util.HashSet;

public class TrainManager {
    public static void main(String[] args) {
        // Core data structures
        LinkedList<String> trainConsist = new LinkedList<>();
        HashSet<String> uniqueBogieIds = new HashSet<>();

        // Helper method to add unique bogies
        String[] bogiesToAdd = {"Engine", "Sleeper", "AC", "Cargo", "Guard", "Sleeper"}; // Note: Duplicate Sleeper

        System.out.println("--- Adding Bogies ---");
        for (String id : bogiesToAdd) {
            if (uniqueBogieIds.add(id)) {
                trainConsist.addLast(id);
                System.out.println("Added: " + id);
            } else {
                System.out.println("Ignored Duplicate: " + id);
            }
        }

        // UC4 Specific Operations
        System.out.println("\n--- Modifying Consist ---");

        // 1. Insert Pantry Car at position 2 (Index 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("Inserted Pantry Car at position 2.");

        // 2. Remove first and last bogie
        System.out.println("Removing first: " + trainConsist.removeFirst());
        System.out.println("Removing last: " + trainConsist.removeLast());

        // 3. Display final ordered consist
        System.out.println("\n--- Final Train Consist ---");
        System.out.println(String.join(" <-> ", trainConsist));
    }
}