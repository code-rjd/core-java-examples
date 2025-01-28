package lessThanEqualTo;

import java.util.Scanner;

public class DiscountEligibilty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter product name ");
        String name = scanner.nextLine();
        System.out.println(" Enter total price of product");
        int price = Integer.parseInt(scanner.nextLine());
        if ( price <= 1000) {
            if (( 500 <= price)){
            System.out.println(" Disount applied");
        } else {
            System.out.println(" Not eligible for discount");
        } }
        else {
                System.out.println(" Not eligible for discount");
            }
    }
    }


