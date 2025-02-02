import java.util.Scanner;

public class CustomerArrayDemo {
   private final Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int customerArraySize = 4;
        CustomerArrayDemo customerArrayDemo = new CustomerArrayDemo();
        Customer customers[] = new Customer[customerArraySize];
        for (int i = 0; i < 4; i++) {
            Customer customer = customerArrayDemo.acceptCustomerRegistration();
            customers[i] = customer;
            //System.out.println("Customer = " + customer);
        }
        //printing using plain for loop
        for (int i = 0; i < 4; i++) {
            System.out.println("Customer :" + i + " : " + customers[i]);
        }
        System.out.println("\n print using for each loop");
        //print using for each loop
        for (Customer customer : customers) {
            System.out.println("Customer :" + customers);
        }

    }
    class Customer {
        String fname;
        String lname;
        public Customer (String fname, String lname) {
            this.fname = fname;
            this.lname = lname;
        }
        public Customer() {
        }
        @Override
        public String toString() {
            return "Customer{" +
                    "fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }

    }
     private Customer acceptCustomerRegistration(){
            System.out.println("enter first name");
            String fname = scanner.nextLine();
            System.out.println("enter last name");
            String lname = scanner.nextLine();
            Customer customer = new Customer();
            customer.fname = fname;
            customer.lname = lname;
            return customer;
        }

        }

