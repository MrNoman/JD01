package DZ5;

public class Rectangle {

    private Point firstPoint;
    private Point secondPoint;

    public Rectangle(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public float calculateArea(Rectangle input){
        return (input.firstPoint.getX() - input.secondPoint.getX()) * (input.firstPoint.getY() - input.secondPoint.getY());
    }

    public float calculateArea(){
        return Math.abs((this.firstPoint.getX() - this.secondPoint.getX()) * (this.firstPoint.getY() - this.secondPoint.getY()));
    }

    public double diagonalLength(Rectangle input){
        return Math.sqrt(Math.pow(input.firstPoint.getX() - input.secondPoint.getX(), 2) + Math.pow(input.firstPoint.getY() - input.secondPoint.getY(), 2));
    }

    public double diagonalLength(){
        return Math.sqrt(Math.pow(this.firstPoint.getX() - this.secondPoint.getX(), 2) + Math.pow(this.firstPoint.getY() - this.secondPoint.getY(), 2));
    }


}
