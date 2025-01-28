package projectSample;

import java.util.Scanner;

public class BookingDemoOverDoWhile {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        BookingDemoOverDoWhile bd = new BookingDemoOverDoWhile();
       int option = 0;
    do{
        System.out.println("----Booking Management----");
        System.out.println("Please choose the option");
        System.out.println("1.Create customer");
        System.out.println("2.Create delivery agent");
        System.out.println("3.Create restaurant");
        System.out.println("4.Create order");
        System.out.println("0. EXIT");
        option = Integer.parseInt(scan.nextLine());

        if(option == 1){
          Customer customer =  bd.createCustomer();
            System.out.println(" Customer Created " + customer);

        }
    } while(option !=0);
    }
    private Customer createCustomer(){
        System.out.println("Please enter id");
        int id = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter name");
        String name = scan.nextLine();
        System.out.println("Please enter city");
        String city = scan.nextLine();

        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setCity(city);
        return customer;

    }
}
