package greaterThan;

import java.util.Scanner;

public class PerformanceMonitoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter usage of computer in % ");
        int usage = Integer.parseInt(scanner.nextLine());
        if ( usage > 80 ){
            System.out.println(" ALERT : usage surpasses 80%");
        }
        else{
            System.out.println(" Usage is in normal range");
        }
    }
}
