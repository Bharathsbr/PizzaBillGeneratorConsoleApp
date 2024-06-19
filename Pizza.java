public class Pizza {
    private int pizzaPrice;
    private boolean veg;

    private int finalPrice=0;
    private int toppingsPrice=150;
    private int cheesePrice=100;

    private int takeAwayPrice=20;
    private int noAddon=0;

    public boolean isCheese;

    public boolean isToppings;
    public boolean istakeHome;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.pizzaPrice = 300;
        } else {
            this.pizzaPrice = 400;
        }
        this.finalPrice+=pizzaPrice;
    }

    public void extraToppings(){
        isToppings=true;
        System.out.println("\nExtra toppings added");
        System.out.println("Toppings :"+toppingsPrice);
        this.finalPrice+=toppingsPrice;
    }

    public void extraCheese(){
        isCheese=true;
        System.out.println("\nExtra Cheese added");
        System.out.println("Cheese :"+cheesePrice);
        this.finalPrice+=cheesePrice;
    }

    public void takeAway(){
        istakeHome=true;
        System.out.println("\nYou opted for take away");
        System.out.println("Take Away :"+takeAwayPrice);
        this.finalPrice+=takeAwayPrice;
    }

        public void getBill(){
            System.out.println("--------------------------------");
            System.out.println("--------------------------------");
            System.out.println("Pizza         :"+pizzaPrice);
            if(isCheese){
                System.out.println("Cheese        :"+cheesePrice);
            }else{
                System.out.println("Cheese        :"+noAddon);
            }
            if(isToppings){
                System.out.println("Toppings      :"+toppingsPrice);
            }else{
                System.out.println("Toppings      :"+noAddon);
            }
            if(istakeHome){
                System.out.println("TakeAway      :"+takeAwayPrice);
            }else{
                System.out.println("TakeAway      :"+noAddon);
            }

            System.out.println("Bill          :"+this.finalPrice);
            System.out.println("--------------------------------");
            System.out.println("--------------------------------");
    }
}
