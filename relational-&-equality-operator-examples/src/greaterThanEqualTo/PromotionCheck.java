package greaterThanEqualTo;

import java.util.Scanner;

public class PromotionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter employee name");
        String name = scanner.nextLine();
        System.out.println(" Enter your tenure ");
        int tenure = Integer.parseInt(scanner.nextLine());
        if (tenure >= 5){
            System.out.println(" Employee can be promoted");
        }
        else {
            System.out.println(" Employee doesn't satisfy the tenure requirement");
        }
    }
}
