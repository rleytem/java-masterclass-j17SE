public class Combo {
    private Burger burger;
    private SideItem sideItem;
    private Drink drink;

    public Combo(){
        this.burger = new Burger("Single","Cheese");
        this.sideItem = new FrenchFries("Small");
        this.drink = new Drink("Small", "Coke");
    }

    public Combo(Burger burger, SideItem sideItem, Drink drink) {
        this.burger = burger;
        this.sideItem = sideItem;
        this.drink = drink;
    }

    public void printReceipt(){
        System.out.printf("%s: %.2f\n",this.burger.getName(),this.burger.getPrice());
        System.out.printf("%s: %.2f\n",this.sideItem.getClass().getSimpleName(),this.sideItem.getPrice());
        System.out.printf("%s: %.2f\n",this.drink.getClass().getSimpleName(),this.drink.getPrice());
    }

    public void getTotal(){
        double total = 0;
        total += (burger.getPrice() + sideItem.getPrice() + drink.getPrice());
        System.out.printf("Your total today is: %.2f\n",total);
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }
}

class DeluxeBurgerCombo extends Combo {
    private DeluxeBurger deluxe;

    public DeluxeBurgerCombo (Burger burger, SideItem sideItem, Drink drink) {
        super(burger, sideItem, drink);
        sideItem.setPrice(0.99);
        drink.setPrice(0.99);
    }
}
