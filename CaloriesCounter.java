public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Product product1 = new Product("mar", 20, 30, 40, 460);
        productCatalog.addProduct(product1);
        productCatalog.printProducts();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog, scanner);

        } while (option != 6);

    }

    public static void printMenu() {
        System.out.println("MENIU:");
        System.out.println("1. Adauga produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. EXIT (Iesi din aplicatie)");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Alege actiunea cu numarul:");

    }

    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner1) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Introdu numele produsului:");
                String name = scanner.nextLine();
                System.out.println("Introdu nr-ul de grasimi al produsului:");
                double fats = scanner.nextDouble();
                System.out.println("Introdu nr-ul de carbohidrati al produsului:");
                double carbs = scanner.nextDouble();
                System.out.println("Introdu nr-ul de proteine al produsului:");
                double proteins = scanner.nextDouble();
                double calories = computerCalories(fats, carbs, proteins);
                Product newProduct = new Product(name, fats, carbs, proteins, calories);
                boolean result = productCatalog.addProduct(newProduct);
                if (result) {
                    System.out.println("Produsul " + newProduct.name + " a fost adaugat");
                } else {
                    System.out.println("Produsul " + newProduct.name + " nu a fost adaugat");
                }
                productCatalog.printProducts();
                break;
            case 2:
                System.out.println("Introdu nr-ul de grasimi al produsului:");
                double fats1 = scanner.nextDouble();
                System.out.println("Introdu nr-ul de carbohidrati al produsului:");
                double carbs1 = scanner.nextDouble();
                System.out.println("Introdu nr-ul de proteine al produsului:");
                double proteins1 = scanner.nextDouble();
                double calories1 = computerCalories(fats1, carbs1, proteins1);
                System.out.println("Numarul de calorii al produsului este: " + calories1);
                break;
            case 3:
                productCatalog.printProducts();
                break;
            case 4:
                System.out.println("Introdu numele produsului pe care vrei sa-l stergi: ");
                String produsDeSters = scanner.nextLine();
                productCatalog.deleteProduct(produsDeSters);
                break;
            case 5:
                System.out.println("Introdu numele produsului pe care vrei sa-l gasesti: ");
                String produsDeGasit = scanner.nextLine();
                productCatalog.getProductsByName(produsDeGasit);
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Optiunea este invalida, reintroducetti optiunea");

        }

    }
}
