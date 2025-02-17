import java.util.*;

interface MealPlan {
    String getMealName();
}

class VegetarianMeal implements MealPlan {
    private String mealName;
    
    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }
    
    @Override
    public String getMealName() {
        return mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;
    
    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }
    
    @Override
    public String getMealName() {
        return mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;
    
    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }
    
    @Override
    public String getMealName() {
        return mealName;
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();
    
    public void addMeal(T meal) {
        meals.add(meal);
    }
    
    public List<T> getMeals() {
        return meals;
    }
}

public class PersonalizedMealPlanGenerator {
    public static void displayMeals(List<? extends MealPlan> meals) {
        meals.forEach(meal -> System.out.println(meal.getMealName()));
    }
    
    public static <T extends MealPlan> void generateMealPlan(Meal<T> mealPlan) {
        System.out.println("Generated Meal Plan:");
        displayMeals(mealPlan.getMeals());
    }
    
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        vegetarianMeals.addMeal(new VegetarianMeal("Grilled Veggies"));
        vegetarianMeals.addMeal(new VegetarianMeal("Pasta Primavera"));

        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal("Quinoa Salad"));
        veganMeals.addMeal(new VeganMeal("Lentil Soup"));

        Meal<KetoMeal> ketoMeals = new Meal<>();
        ketoMeals.addMeal(new KetoMeal("Grilled Chicken"));
        ketoMeals.addMeal(new KetoMeal("Avocado Salad"));

        System.out.println("Vegetarian Meal Plan:");
        generateMealPlan(vegetarianMeals);
        
        System.out.println("\nVegan Meal Plan:");
        generateMealPlan(veganMeals);
        
        System.out.println("\nKeto Meal Plan:");
        generateMealPlan(ketoMeals);
    }
}
