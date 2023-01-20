import Shape2D.*;
import Shape3D.*;

public class Assignment2 {

  public static void main(String[] args) {
    Circle c = new Circle(5);
    System.out.println("Area of circle: " + c.area());
    System.out.println("Perimeter of circle: " + c.peri());
    Traingle t = new Traingle(3, 4, 5);
    System.out.println("Area of triangle: " + t.area());
    System.out.println("Perimeter of triangle: " + t.peri());
    Rectangle r = new Rectangle(5, 6);
    System.out.println("Area of rectangle:" + r.area());
    System.out.println("Perimeter of rectangle: " + r.peri());
    Sphere s = new Sphere(7);
    System.out.println("Surface area ofsphere: " + s.surfArea());
    System.out.println("Volume ofsphere: " + s.volume());
    Cuboid cu = new Cuboid(5, 6, 7);
    System.out.println("Surface area of cuboids:" + cu.surfArea());
    System.out.println("Volume of cuboids: " + cu.volume());
    Cylinder cy = new Cylinder(7, 8);
    System.out.println("Surface area of cylinder: " + cy.surfArea());
    System.out.println("Volume of cylinder: " + cy.volume());
  }
}
