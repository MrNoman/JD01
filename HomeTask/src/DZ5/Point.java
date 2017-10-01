package DZ5;

public class Point {
    private float x;
    private float y;

    public Point (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point input) {
        return Math.sqrt(Math.pow(input.x - this.x, 2) + Math.pow(input.y - this.y, 2));
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
}
