package arithmetic.evenodd;

import java.util.Scanner;

public class EvenOddDemo {
            //  ask to enter value
            //  accept value
            // if no%==0 then even else odd
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Please enter the value");
                int no = Integer.parseInt(scanner.nextLine());

                // old fashion
                if (no % 2 == 0){
                    System.out.println(" this is even no");
                }
                else {
                    System.out.println(" this is odd no");
                }




            }
}
