public class Wall {

    private double width = 0;
    private double height = 0;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;

        if (width < 0) {
            this.width = 0;
        }
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return (this.width * this.height);
    }
}
