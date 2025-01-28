package greaterThan;

import java.util.Scanner;

public class BankBalanceValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter account holder's name");
        String name = scanner.nextLine();
        System.out.println(" Please enter balance in the account");
        int balance = Integer.parseInt(scanner.nextLine());
        System.out.println(" Enter amount to be withdrawn");;
        int amount = Integer.parseInt(scanner.nextLine());

        if ( amount < balance ){
            System.out.println(" Sufficient Balance for withdrawing the entered amount");
        }
        else {
            System.out.println(" Insufficient balance as Amount entered exceeds the balance amount ");

        }
    }
}
