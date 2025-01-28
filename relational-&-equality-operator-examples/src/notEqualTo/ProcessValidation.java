package notEqualTo;

import java.util.Objects;
import java.util.Scanner;

public class ProcessValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter name of native place ");
        String a = scanner.nextLine();
        String d = "Amravati";
        if (!a.equals(d))
        {
            System.out.println(" SKIP ");
        }
        else {
            System.out.println(" Input city equal to default city, PROCESS CONTINUED");
        }
    }
}
