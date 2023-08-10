package OOP.ex3;

public class Product {
        String name;
        double fats;
        double carbs;
        double proteins;
        double calories;

        public Product(String name, double fats, double carbs, double proteins, double calories) {
            this.name = name;
            this.fats = fats;
            this.carbs = carbs;
            this.proteins = proteins;
            this.calories = calories;
        }

    public Product(String name, double fats, double carbs, double proteins) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
    }

    public static double computerCalories(double fats, double carbs, double proteins){
            double calories = 0;
            return calories;
        }
    }

}
