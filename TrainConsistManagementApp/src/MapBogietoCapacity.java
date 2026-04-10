import java.util.*;

public class MapBogietoCapacity {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===========================================\n");

        // Create HashMap (key → value)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT (put) ----
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        // ---- DISPLAY using entrySet() ----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}
