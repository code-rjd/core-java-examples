package staticDemo;

import java.util.Scanner;

public class AdvanceStaticDemo {

   static int staticNo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value");

        staticNo = Integer.parseInt(scanner.nextLine());

        AdvanceStaticDemo object1 = new AdvanceStaticDemo();
        object1.printNo();
        AdvanceStaticDemo object2 = new AdvanceStaticDemo();
        object2.printNo();

        staticNo = 25;
        //as the staticNo is declared static, so it can be accessed across all the objects.
        //no need to assign object
        //can directly declare the value
        // ideally it shouldn't allow,
        // this began after java 11 or java 8

        //also when the global variable is not declared as static, for accessing it,
                    //we need to assign the object everytime.

        object1.printNo();
        object2.printNo();
    }
    public void printNo(){
        System.out.println(" staticNo = " + staticNo);
    }
}
