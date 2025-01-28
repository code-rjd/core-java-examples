package nestedIfDemo;

import java.util.Scanner;

public class DataSynchronisation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter name  ");
        String name = scanner.nextLine();
        System.out.println(" Enter age ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(" Enter city ");
        String b = scanner.nextLine();

        String nameB = "Virat Kohli";
        int aB = 38;
        String bB = "Delhi";

        if (!name.equals(nameB)) {
            System.out.println(" Name mismatched");
            if (a != aB) {
                System.out.println("Age mismatched");
            }
            if (!b.equals(bB)) {
                System.out.println("City mismatched");
            }
            }
        else if (a != aB) {
                System.out.println("Age mismatched");
            if (!b.equals(bB)) {
                System.out.println("City mismatched");
            }
            }
        else if (!b.equals(bB)) {
                System.out.println("City mismatched");
        }
        else {
                System.out.println(" All the data correct");
        }
    }
}







