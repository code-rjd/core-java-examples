package equalTo;

import java.util.Scanner;

public class ConfigurationValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter system RAM configuration ");
        String a = scanner.nextLine();
        String b = "4gb";
        if (a.equals(b)){
            System.out.println("System configuration upto mark");
        }
        else {
            System.out.println(" System configuration invalid");
        }
    }
}
