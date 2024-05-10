package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceimpl;

public class Test {

    private ProductService productService;

    public Test() {
        productService = new ProductServiceimpl(); // Initialize productService here
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private void addProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.next();

        System.out.print("Enter product company: ");
        String company = scanner.next();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        Product product = new Product();
        product.setName(name);
        product.setCompany(company);
        product.setPrice(price);

        productService.addProduct(product);
    }

    private void viewAllProducts() {
        List<Product> productList = productService.getAllProducts();
        if (productList.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("List of products:");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    private void deleteProduct(Scanner scanner) {
        System.out.print("Enter product ID to delete: ");
        int productId = scanner.nextInt();
        productService.deleteProduct(productId);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.start();
    }
}
