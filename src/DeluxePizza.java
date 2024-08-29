public class DeluxePizza extends Pizza{

    @Override
    public void addExtraToppings() {}

    @Override
    public void addExtraCheese() {}

    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
