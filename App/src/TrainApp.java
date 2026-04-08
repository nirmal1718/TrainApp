import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize the Train Consist Management App
 */
public class TrainApp {

    public static void main(String[] args) {
        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Train consist is initialized
        // Using the List interface with ArrayList for dynamic initialization
        // We assume the train consists of 'Bogie' objects (represented as Strings here for UC1)
        List<String> trainConsist = new ArrayList<>();

        // 3. Initial bogie count is displayed
        // size() returns the number of elements in the list
        int initialCount = trainConsist.size();
        System.out.println("Status: Train initialized.");
        System.out.println("Initial bogie count: " + initialCount);

        // 4. Program continues
        System.out.println("Ready for operations...");
    }
}