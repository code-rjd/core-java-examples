package lessThanEqualTo;

import java.util.Scanner;

public class TaskScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter name of task ");
        String name = scanner.nextLine();
        System.out.println(" Enter deadline");
        int date = Integer.parseInt(scanner.nextLine());
        if ( date <= 15)
        {
            System.out.println(" Task Assigned with deadline : " + date +" of this month" );
        }
        else {
            System.out.println(" Task not assigned");
        }
    }
}
