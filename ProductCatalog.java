package OOP.ex3;

public class ProductCatalog {

    Product[] products;

    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product(maxNumberOfProducts);
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        for (int i =0; i<numberOfProducts; i++){
            System.out.println(products[i].name + " " + products[i].fats + " " + products[i].carbs + " " + products[i].proteins + " " + products[i].calories );
        }
    }

    public boolean addProduct(Product product) {
        return true;
    }

    public Product getProductsByName(String name) {
        return null;
    }

    public boolean deleteProduct(String name) {
        return true;
    }
}
