public class MyPoint {
    private int x;
    private int y;

    MyPoint() {
        x = 0;
        y = 0;
    }


    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}