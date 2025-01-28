package greaterThanEqualTo;

import java.util.Scanner;

public class FitnessTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number of steps walked today");
        int step = Integer.parseInt(scanner.nextLine());
        System.out.println(" Enter daily goal of steps");
        int goal = Integer.parseInt(scanner.nextLine());
        if ( step >= goal){
            System.out.println(" Daily goal achieved ");
        }
        else {
            System.out.println(" Daily goal of steps walked are not achieved");
        }
    }
}
