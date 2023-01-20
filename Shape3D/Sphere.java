package Shape3D;

public class Sphere {
  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  public double surfArea() {
    return 4 * Math.PI * radius * radius;
  }

  public double volume() {
    return (4.0 / 3.0) * Math.PI * radius * radius * radius;
  }
}
