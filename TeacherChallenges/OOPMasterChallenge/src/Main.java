public class Main {

    public static void main(String[] args) {

        //sample menu items
        Burger single = new Burger("Single","Cheese");
        Burger single2 = new Burger("Double","Cheese","Ketchup");
        Burger triple = new Burger("Triple","Cheese","Ketchup","Mustard");
        Burger baconDouble = new Burger("Double", "Cheese", "Ketchup", "Bacon");
        DeluxeBurger deluxe = new DeluxeBurger("Deluxe","Cheese","Lettuce","Bacon", "Tomato",
                "Onion");

        SideItem fries = new FrenchFries("Small");
        SideItem friesM = new FrenchFries("Medium");
        SideItem friesL = new FrenchFries("Large");

        SideItem oRings = new OnionRings("Small");
        SideItem oRingsM = new OnionRings("Medium");
        SideItem oRingsL = new OnionRings("Large");

        SideItem cCurds = new CheeseCurds("Small");
        SideItem cCurdsM = new CheeseCurds("Medium");
        SideItem cCurdsL = new CheeseCurds("Large");

        Drink sDrink = new Drink("Small", "Coke");
        Drink mDrink = new Drink("Medium", "Coke");
        Drink mDiet = new Drink("Medium", "Diet Coke");
        Drink lDrink = new Drink("Large", "Coke");

        Drink vMilk = new Milkshake("Medium", "Vanilla");
        Drink cMilk = new Milkshake("Medium", "Chocolate");
        Drink sMilk = new Milkshake("Medium", "Strawberry");

        //combos
        Combo number1 = new Combo();
        Combo number2 = new Combo(single2, friesM, mDrink);
        Combo number3 = new Combo(baconDouble, oRingsM, lDrink);
        Combo number4 = new Combo(triple,cCurdsL,sMilk);
        DeluxeBurgerCombo deluxeCombo = new DeluxeBurgerCombo(deluxe,friesL,mDrink);

        //printReceipt and getTotal
        ringUp(number1);
        ringUp(number2);
        ringUp(number3);
        ringUp(number4);
        ringUp(deluxeCombo);


    }

    public static void ringUp(Combo combo) {
        combo.printReceipt();
        combo.getTotal();
    }

}
