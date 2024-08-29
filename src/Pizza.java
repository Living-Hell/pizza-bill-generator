public class Pizza {
    private int price;
    private boolean isVeg;

    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int takeAwayBagPrice = 20;
    private final int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOrderOptedForTakeAway = false;


    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        } else{
            this.price = 400;
        }
        basePizzaPrice = isVeg ? 300 : 400;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAwayOrder(){
        isOrderOptedForTakeAway = true;
        this.price += takeAwayBagPrice;
    }

    public void getBill(){
        String bill = "Bill-\nBase Price Of The Pizza: " + basePizzaPrice + "\n";
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }
        if(isOrderOptedForTakeAway){
            bill += "Order Opted For Takeaway: " + takeAwayBagPrice + "\n";
        }

        bill += "Total Price: " + this.price;
        System.out.println(bill);
    }
}
