public class SideItem {
    private String size;
    private double price;

    public SideItem(String size) {

        this.size = size;
        switch (size) {
            case "Small":
                this.price = 1.99;
                break;
            case "Medium":
                this.price = 2.49;
                break;
            case "Large":
                this.price = 2.99;
                break;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}

class FrenchFries extends SideItem {

    public FrenchFries(String size) {
        super(size);
    }

}

class OnionRings extends  SideItem {

    public OnionRings(String size) {
        super(size);
    }

}

class CheeseCurds extends  SideItem {

    public CheeseCurds(String size) {
        super(size);
        switch (size) {
            case "Small":
                setPrice(2.49);
                break;
            case "Medium":
                setPrice(2.99);
                break;
            case "Large":
                setPrice(3.49);
                break;
        }
    }
}
