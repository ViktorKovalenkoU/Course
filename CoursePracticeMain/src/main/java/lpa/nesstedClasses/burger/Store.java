package lpa.nesstedClasses.burger;

public class Store {

    public static void main(String[] args) {
        /*Meal regularMeal = new Meal();
        System.out.println(regularMeal);*/

        Meal toppingMeal = new Meal();
        toppingMeal.addBurgerToppings("onion");
        toppingMeal.addBurgerToppings("bacon");
        toppingMeal.addBurgerToppings("cheese");
        System.out.println();
        System.out.println(toppingMeal);
    }
}
