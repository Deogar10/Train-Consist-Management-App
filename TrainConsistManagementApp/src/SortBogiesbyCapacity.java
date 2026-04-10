import java.util.*;

public class SortBogiesbyCapacity {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("===========================================\n");

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (ascending by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // After sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}
