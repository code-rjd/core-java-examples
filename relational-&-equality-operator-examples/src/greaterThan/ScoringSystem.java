package greaterThan;

import java.util.Scanner;

public class ScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Candidate's name");
        String name = scanner.nextLine();
        System.out.println(" Enter candidate's score ");
        int score = Integer.parseInt(scanner.nextLine());

        if ( score > 90 ){
            System.out.println(" Candidate's score surpasses benchmark");
        }
        else {
            System.out.println(" Candidate's score doesn't pass benchmark");
        }
    }
}
