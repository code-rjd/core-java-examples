package notEqualTo;

import java.util.Objects;
import java.util.Scanner;

public class UserPriviledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter user name  ");
        String name = scanner.nextLine();
        System.out.println(" Enter user role ");
        String a = scanner.nextLine();
        String b = "admin";
        if (!Objects.equals(a, b))
        {
            System.out.println(" ACCESS RESTRICTED");
        }
        else {
            System.out.println(" ACCESS ALLOWED");
        }
    }
}
