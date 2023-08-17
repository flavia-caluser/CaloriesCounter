package OOP.ex3;

public class Product {
    String name;
    double fats;
    double carbs;
    double proteins;
    double calories;


    public Product(String name, double fats, double carbs, double proteins) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;

    }

    public Product(String name, double fats, double carbs, double proteins, double calories) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
        this.calories = calories;
    }

    public static double computerCalories(double fats, double carbs, double proteins) {
        double calories = 9 * fats + 4 * (carbs + proteins);
        this.calories = calories;
        return calories;
    }
}

}
