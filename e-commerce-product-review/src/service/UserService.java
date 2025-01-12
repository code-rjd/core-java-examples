package service;

import model.User;

import java.util.Scanner;

public class UserService {

    public User acceptUserData(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user id");
        //int id = scanner.nextInt();
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter user first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter user last name");
        String lastName = scanner.nextLine();

        //initialize entity
        User user = new User();
        user.id = id;
        user.firstName = firstName;
        user.lastName = lastName;


        return user;
    }

}
