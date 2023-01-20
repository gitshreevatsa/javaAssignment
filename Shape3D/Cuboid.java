package Shape3D;

public class Cuboid {
  private double l, b, h;

  public Cuboid(double l, double b, double h) {
    this.l = l;
    this.b = b;
    this.h = h;
  }

  public double surfArea() {
    return 2 * (l * b + b * h + h * l);
  }

  public double volume() {
    return l * b * h;
  }
}
