import java.util.*;

public class MaintainOrderedBogieIDs  {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("========================================\n");

        // Create LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT at position 2 ----
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE first and last ----
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // Final message
        System.out.println("\nUC4 ordered consist operations completed...");
    }
}
