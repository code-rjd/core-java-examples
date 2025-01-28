package notEqualTo;

import java.util.Objects;
import java.util.Scanner;

public class ErrorDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter file name  ");
        String name = scanner.nextLine();
        System.out.println(" Enter file format ");
        String a = scanner.nextLine();
        String b = ".jpeg";
        if (!Objects.equals(a, b))
        {
            System.out.println(" Alert - File format not supported");
        }
        else {
            System.out.println(" File format supported");
        }
    }
}
