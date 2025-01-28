package lessThan;

import java.util.Scanner;

public class StockMonitoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter product name ");
        String name = scanner.nextLine();
        System.out.println(" Enter inventory level in %");
        int level = Integer.parseInt(scanner.nextLine());
        if ( level < 20 )
        {
            System.out.println(" ALERT - Inventory falls below minimum threshold");
        }
        else {
            System.out.println(" Inventory is above threshold");
        }
    }
}
