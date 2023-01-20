package Shape3D;

public class Cylinder {
  private double r, h;

  public Cylinder(double r, double h) {
    this.r = r;
    this.h = h;
  }

  public double surfArea() {
    return 2 * Math.PI * r * (r + h);
  }

  public double volume() {
    return Math.PI * r * r * h;
  }
}
