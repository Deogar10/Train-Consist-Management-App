import java.util.*;

public class AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("=== UC2 - Add Passenger Bogies to Train ===");
        System.out.println("========================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        // ---- DELETE (Remove bogie) ----
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        // ---- READ (Check existence) ----
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}
