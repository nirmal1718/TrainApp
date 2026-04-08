import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        // 1. Create a HashMap to store bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Insert capacity values using the put() method
        // Key-Value Association: Binding bogie names to their properties
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 78);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);
        bogieCapacityMap.put("AC 3-Tier", 64);

        System.out.println("--- Railway Bogie Capacity Mapping ---");

        // 3. Iterate over the map using entrySet()
        // This allows access to both the Key and Value in a single loop
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieType = entry.getKey();
            Integer capacity = entry.getValue();

            // 4. Display each bogie along with its corresponding capacity
            System.out.println("Bogie Type: " + bogieType + " | Capacity: " + capacity + " seats");
        }

        // 5. Fast Lookup Example
        // Demonstrating the efficiency of the Map interface
        String searchKey = "Sleeper";
        if (bogieCapacityMap.containsKey(searchKey)) {
            System.out.println("\nFast Lookup: The " + searchKey + " bogie has " +
                    bogieCapacityMap.get(searchKey) + " seats.");
        }

        System.out.println("\nProgram execution completed.");
    }
}