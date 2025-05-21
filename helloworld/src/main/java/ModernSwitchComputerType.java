import java.util.Scanner;

public class ModernSwitchComputerType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your computer type: ");
        String computerType = scanner.nextLine();

        //convert to lower case
        computerType = computerType.toLowerCase();
        // Version1
        /*
        switch (computerType) {
            case "smartphone" -> System.out.println("Smart phones offer computing power in your hand");
            case "tablet" -> System.out.println("Tablets are lightweight for browing and light task");
            case "laptop" -> System.out.println("Laptops are portable for work on the go");
            case "desktop" -> System.out.println("Desktops excel in gamin and work related task");
            default -> System.out.println("Unknown computer type");
        }
        */
        // Version 2
        String description = switch (computerType) {
            case "smartphone" -> "Smart phones offer computing power in your hand";
            case "tablet" -> "Tablets are lightweight for browing and light task";
            case "laptop" -> "Laptops are portable for work on the go";
            case "desktop" -> "Desktops excel in gamin and work related task";
            default -> "Unknown computer type";
        };

            System.out.println(description);

        scanner.close();
    }
}
