package equalTo;

import java.util.Scanner;

public class FeatureToggle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter setting configuration message in true or false ");
        String a = scanner.nextLine();
        String b = "true";
if (a.equals(b)){
    System.out.println("Enable feature");
}
else {
    System.out.println(" Features not enabled ");
}
}
}