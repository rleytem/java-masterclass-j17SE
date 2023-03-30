public class Burger {
    private String name;
    private double price;
    private String top1;
    private String top2;
    private String top3;

    public Burger (String name) {
        this.name = name;
        switch (name) {
            case "Single":
                this.price = 3.99;
                break;
            case "Double":
                this.price = 4.49;
                break;
            case "Triple":
                this.price = 4.99;
                break;
        }
    }

    public Burger (String name, String top1) {
        this(name);
        this.top1 = top1;
        this.price += .29;
    }

    public Burger(String name, String top1, String top2) {
        this(name, top1);
        this.top2 = top2;
        this.price += .58;
    }

    public Burger(String name, String top1, String top2, String top3) {
        this(name, top1, top2);
        this.top3 = top3;
        this.price += .87;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

}

class DeluxeBurger extends Burger {
    private String top4;
    private String top5;

    public DeluxeBurger(String name, String top1, String top2, String top3) {
        super(name, top1, top2, top3);
        setPrice(5.00);
    }

    public DeluxeBurger(String name, String top1, String top2, String top3, String top4) {
        this(name, top1, top2, top3);
        this.top4 = top4;
        setPrice(5.00);
    }

    public DeluxeBurger(String name, String top1, String top2, String top3, String top4, String top5) {
        this(name, top1, top2, top3, top4);
        this.top5 = top5;
        setPrice(5.00);
    }

    @Override
    public String getName() {
        return "Deluxe Burger";
    }
}