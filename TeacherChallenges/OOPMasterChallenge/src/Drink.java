public class Drink {
    private String size;
    private double price;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        switch (size) {
            case "Small":
                this.price = 0.99;
                break;
            case "Medium":
                this.price = 1.49;
                break;
            case "Large":
                this.price = 1.99;
                break;
        }
        this.flavor = flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}

class SoftDrink extends Drink {

    public SoftDrink(String size, String flavor) {
        super(size, flavor);
    }

}

class Milkshake extends Drink {
    private String flavor;

    public Milkshake(String size, String flavor) {
        super(size, flavor);
        switch (flavor) {
            case "Vanilla":
                setPrice(2.99);
                break;
            case "Chocolate":
                setPrice(2.99);
                break;
            case "Strawberry":
                setPrice(3.49);
                break;
        }

    }

}
