package equalTo;

import java.util.Scanner;

public class StatusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter whether system ready or not ");
        String a = scanner.nextLine();
        String b = "ready";
        if (a.equals(b)){
            System.out.println("System ready");
        }
        else {
            System.out.println(" System not ready");
        }
    }
}
