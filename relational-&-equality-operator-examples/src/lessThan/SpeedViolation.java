package lessThan;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class SpeedViolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number vehicle ");
        String name = scanner.nextLine();
        System.out.println(" Enter speed of vehicle");
        int speed = Integer.parseInt(scanner.nextLine());
        if ( speed < 80)
        {
            System.out.println(" Speed under limit");
        }
        else {
            System.out.println(" ALERT = SPEED EXCEEDS LIMIT");
        }
    }
    }


