import java.util.ArrayList;
import java.util.List;



public class SafetyCompliance {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create Goods Bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        // Uncomment below to test failure case
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Step 2: Safety Validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}
