package Shape2D;

public class Rectangle {
    private double l, b;
    public Rectangle(double l, double b){
    this.l =l;
    this.b=b ;
    }
    public double area() {
        return l * b;
    }
    public double peri() {
    return 2 * (l +b);
    }
}
