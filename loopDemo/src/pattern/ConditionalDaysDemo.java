package pattern;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ConditionalDaysDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter tthe days of the week in integer");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());
        System.out.println("\n output from if");
        if(dayOfWeek == 1){
            System.out.println("Sunday");
        }if(dayOfWeek == 2){
            System.out.println("Monday");
        }if(dayOfWeek == 3){
            System.out.println("Tuesday");
        }if(dayOfWeek == 4){
            System.out.println("Wednesday");
        }if(dayOfWeek == 5){
            System.out.println("Thursday");
        }if(dayOfWeek == 6){
            System.out.println("Friday");
        }if(dayOfWeek == 7){
            System.out.println("Saturday");
        }

        System.out.println("\n output from if else ");
        if(dayOfWeek == 1){
            System.out.println("Sunday");
        }else if(dayOfWeek == 2){
            System.out.println("Monday");
        }else if(dayOfWeek == 3){
            System.out.println("Tuesday");
        }else if(dayOfWeek == 4){
            System.out.println("Wednesday");
        }else if(dayOfWeek == 5){
            System.out.println("Thursday");
        }else if(dayOfWeek == 6){
            System.out.println("Friday");
        }else if(dayOfWeek == 7){
            System.out.println("Saturday");
        }

        //OPTIMIZED SWITCH
        System.out.println("\n output from switch");
        switch (dayOfWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
