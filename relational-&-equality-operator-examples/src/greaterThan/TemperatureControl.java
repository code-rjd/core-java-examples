package greaterThan;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter current room temperature in celsius");
        int temp = Integer.parseInt(scanner.nextLine());
        if( temp > 25 ){
            System.out.println(" Activate the cooling system");
        }
    else {
            System.out.println(" Temperature is in adequate range ");
        }
    }
}
