package staticDemo;

import java.util.Scanner;

public class AdvanceStaticDemo {

    static int staticNo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value");
        staticNo = Integer.parseInt(scan.nextLine());

        AdvanceStaticDemo object1 = new AdvanceStaticDemo();
        object1.printNo();
        AdvanceStaticDemo object2 = new AdvanceStaticDemo();
        object2.printNo();

        object1.staticNo = 25;
        object1.printNo();
        object2.printNo();
    }
    public void printNo(){
        System.out.println(" staticNo = " + staticNo);
    }
}
