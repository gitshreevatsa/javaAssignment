package Shape2D;

public class Traingle {
  private double a, b, c;

  public Traingle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double area() {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public double peri() {
    return a + b + c;
  }
}
