package OOP.ex3;

public class ProductCatalog {

    Product[] products;

    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].name + " " + products[i].fats + " " + products[i].carbs + " " + products[i].proteins + " " + products[i].calories);
        }
    }

    public boolean addProduct(Product product) {
        if (isProductAdded(product) || numberOfProducts == maxNumberOfProducts) {
            return false;
        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
        }
        return true;
    }

    public boolean isProductAdded(Product product) {
        if (getProductsByName(product.name) == null) {
            return false;
        }
        return true;
    }

    public Product getProductsByName(String name) {
        //parcurg lista de produse si verific daca numele primit ca parametru este acelasi
        // cu cel al unuia din lista de produse
        //daca il gasesc il returnez
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.equals(name)) {
                return products[i];
            }
        }
        return null;
    }

    public int getProductsIndexByName(String name) {
        if (numberOfProducts == 0) {
            return -1;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteProduct(String name) {
        //gasesc produsul in lista si mut fiecare produs de dupa el cu o pozitie in urma si pe ultima o fac null-a
        if (getProductsIndexByName(name) == -1)
            return false;
        for (int i = getProductsIndexByName(name) + 1; i < numberOfProducts-1; i++) {
            products[i] = products[i+1];
        }
        numberOfProducts--;
        products[numberOfProducts] = null;
        return true;
    }
}
