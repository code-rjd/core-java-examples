package service;

import model.Review;

import java.util.Scanner;

public class ReviewService {
    public Review acceptReviewData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter user Id");
        int id= Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter heading");
        String heading = scanner.nextLine();

        System.out.println("Please enter product description");
        String description = scanner.nextLine();

        System.out.println(" Please enter rating of the product out of 5 stars");
        int rating = Integer.parseInt(scanner.nextLine());

        //initialize entity
        Review review = new Review();
        review.id = id;
        review.heading = heading;
        review.description = description;
        review.rating = rating;


        return review;
    }
}
