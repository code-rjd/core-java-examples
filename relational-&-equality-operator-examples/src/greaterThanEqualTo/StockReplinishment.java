package greaterThanEqualTo;

import java.util.Scanner;

public class StockReplinishment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter product name ");
        String name = scanner.nextLine();
        System.out.println(" Enter inventory level in %");
        int level = Integer.parseInt(scanner.nextLine());
        if (20 >= level)
        {
            System.out.println("Inventory is below order level ");
        }
        else {
            System.out.println("Trigger restocking : inventory level above threshold ");
        }
    }
}
