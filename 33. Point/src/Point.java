public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y= y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Math.sqrt(((0 - this.x * (0 - this.x)) + ((0 - this.y) * (0 - this.y))));
    }

    public double distance(int x, int y) {
        return this.x - this.y;
    }

    public double distance(double point) {
        double temp = this.x - this.y;
        return temp - point;

    }

    public double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {

    }
}
