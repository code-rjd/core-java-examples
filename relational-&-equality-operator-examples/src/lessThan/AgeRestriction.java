package lessThan;

import java.util.Scanner;

public class AgeRestriction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter name");
        String name = scanner.nextLine();
        System.out.println(" Please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        if ( age < 18 ){
            System.out.println(" ACCESS DENIED - Too young to access the content");
        }
        else {
            System.out.println(" ACCESS ALLOWED - You can access the content ");
        }
    }
    }
