import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// The class name must match your filename (TrainApp.java)
public class TrainApp {

    // Inner class to represent the Bogie data structure
    static class Bogie {
        private String name;
        private int capacity;

        // The constructor name MUST match the class name "Bogie"
        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() { return name; }
        public int getCapacity() { return capacity; }

        @Override
        public String toString() {
            return String.format("%-15s | Capacity: %d", name, capacity);
        }
    }

    public static void main(String[] args) {
        // 1. Create a List to store Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // 2. Add passenger bogies with varying capacities
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair Car", 78));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));
        bogieList.add(new Bogie("AC 3-Tier", 64));

        System.out.println("--- Original List ---");
        bogieList.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // This logic compares the 'capacity' field of each object
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\n--- Sorted by Capacity (Low to High) ---");
        // 4. Display the sorted results
        bogieList.forEach(System.out::println);

        // Bonus: Sorting in descending order
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\n--- Sorted by Capacity (High to Low) ---");
        bogieList.forEach(System.out::println);
    }
}