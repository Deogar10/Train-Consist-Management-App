import java.util.*;

public class TrackUniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=======================================\n");

        // Create HashSet (stores only unique values)
        Set<String> bogies = new HashSet<>();

        // ---- ADD (including duplicates) ----
        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("B6104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("B6101");
        bogies.add("B6102");

        // Display final unique bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note message
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}
