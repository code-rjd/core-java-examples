import java.util.Scanner;

public class LevelEnumDemo {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter tempertaure level");
        String levelString = scanner.nextLine();

        Level temperatureLevel = Level.fromValue(levelString);
        System.out.println("current temp level : " + temperatureLevel);

        User user = new User();
        user.id = 1;
        user.name = "r";
        user.userType = UserType.CUSTOMER;
        System.out.println("user: " + user);
    }
}
