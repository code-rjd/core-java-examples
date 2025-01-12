import model.Product;
import model.Review;
import model.User;
import service.ProductService;
import service.ReviewService;
import service.UserService;

public class ReviewSystemDemo {
    public static void main(String[] args) {
        System.out.println("**** E-commerce review system *****");

        UserService userService = new UserService();
        User user = userService.acceptUserData();

        ProductService productService = new ProductService();
        Product product = productService.acceptProductData();

        ReviewService reviewService = new ReviewService();
        Review review = reviewService.acceptReviewData();

        // completed all processing
        // print data

        System.out.println("User details are: " + user );
        System.out.println("Product details are : " + product);
        System.out.println(" Rating details of the product are: " + review);

    }
}
