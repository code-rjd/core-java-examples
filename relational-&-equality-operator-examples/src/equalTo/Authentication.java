package equalTo;

import java.util.Objects;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter username");
        String a = scanner.nextLine();

        String d = "Radheya" ;
        if (a.equals( d)){
            System.out.println(" Username valid");
        }
        else {
            System.out.println(" Username invalid");
        }

    }
}
