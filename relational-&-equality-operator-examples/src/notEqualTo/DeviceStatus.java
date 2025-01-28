package notEqualTo;

import java.util.Objects;
import java.util.Scanner;

public class DeviceStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter device name  ");
        String name = scanner.nextLine();
        System.out.println(" Enter device status ");
        String a = scanner.nextLine();
        String b = "online";
        if ( !a.equals(b))
        {
            System.out.println(" Status is OFFLINE");
        }
        else {
            System.out.println("ONLINE");
        }
    }
}
