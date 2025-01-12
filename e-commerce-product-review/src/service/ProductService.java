package service;

import model.Product;

import java.util.Scanner;

public class ProductService {
    public Product acceptProductData() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Product id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println(" Please enter product name");
        String productName = scanner.nextLine();

        System.out.println(" Please enter product price");
        double productPrice = scanner.nextDouble();

        //initialize entity
        Product product = new Product();
            product.id = id;
            product.productName = productName;
            product.productPrice = productPrice;

        return product;
    }
}
