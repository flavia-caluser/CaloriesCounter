package OOP.ex3;

import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Product product1 = new Product("mar", 20, 30, 40);
        productCatalog.addProduct(product1);
        productCatalog.getProductsByName("mar");
//        Scanner scanner = new Scanner(System.in);
//        int option = 0;
//        do {
//            printMenu();
//            option = scanner.nextInt();
//            performSelectedAction(option, productCatalog, scanner);
//
//        } while (option != 6);
//
//    }

//    public static void printMenu() {
//
//    }

//    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner1) {
//            Scanner scanner1 = new Scanner(System.in);
//        }
//        switch (option) {
//            case 1:
//                String name = scanner.nextLine();
//                double fats = scanner.nextDouble();
//                double carbs = scanner.nextDouble();
//                double proteins = scanner.nextDouble();
//                Product newProduct = new Product(name, fats, carbs, proteins);
//                boolean result = productCatalog.addProduct(newProduct);
//        }

    }
}
