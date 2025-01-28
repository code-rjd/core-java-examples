package greaterThanEqualTo;

import java.util.Scanner;

public class ExamCutoff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter candidate's name");
        String name = scanner.nextLine();
        System.out.println(" Enter candidate's score");
        int score = Integer.parseInt(scanner.nextLine());
        if (score >= 75) {
            System.out.println(" Candidate can be selected");
        }
        else{
            System.out.println(" Candidate cannot be selected as score is below cutoff");
        }
    }
}
