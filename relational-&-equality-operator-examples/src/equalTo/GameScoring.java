package equalTo;

import java.util.Scanner;

public class GameScoring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter player's score");
        int a = Integer.parseInt(scan.nextLine());
        int b = 50;
        if ( a==b){
            System.out.println(" Player matches winning target");
        }
        else {
            System.out.println(" Winning target not achieved");
        }
    }
}
