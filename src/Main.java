public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAwayOrder();
        basePizza.getBill();

        DeluxePizza delPizza = new DeluxePizza(true);
        delPizza.takeAwayOrder();
        delPizza.getBill();
    }
}