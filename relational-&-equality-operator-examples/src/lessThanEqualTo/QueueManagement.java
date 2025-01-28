package lessThanEqualTo;

import java.util.Scanner;

public class QueueManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter number of people in queue");
        int no = Integer.parseInt(scanner.nextLine());
        if ( no <= 500)
        {
            System.out.println(" Request ACCEPTED");
        }
        else {
            System.out.println(" Request DENIED");
        }
    }
}
