package OOP.ex3;

import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog, scanner);

        } while (option != 6);

    }

    public static void printMenu() {

    }

    public static void performSelectedAction(int option, ProductCatalog productCatalogue, Scanner scanner) {
        switch (option) {
            case 1:
                String name = scanner.nextLine();
                double fats = scanner.nextDouble();
                double carbs = scanner.nextDouble();
                double proteins = scanner.nextDouble();
                Product newProduct = new Product(name, fats, carbs, proteins);
                boolean result = productCatalogue.addProduct(newProduct);
        }

    }
}
