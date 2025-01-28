package greaterThanEqualTo;

import java.util.Scanner;

public class EligibilityCriteria {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please enter name of the student");
        String name = scanner.nextLine();

        System.out.println(" Enter marks obtained out of 100");
        int marks = Integer.parseInt(scanner.nextLine());
        if ( marks <= 100){
                if ( marks >= 75 ){
            System.out.println(" Student is eligible for scholarship with marks: " + marks);
                }
        else {
            System.out.println(" Student not eligible for scholarship with marks:" + marks);
        }}
   else {
            System.out.println("Invalid marks entered, please enter marks out of 100");
}
}
}