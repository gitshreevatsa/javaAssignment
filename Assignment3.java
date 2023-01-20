import java.util.Scanner;

class Root {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Enter the degree of the equation (1 for linear, 2 forquadratic, 3 for cubic):"
    );
    int degree = sc.nextInt();
    switch (degree) {
      case 1:
        System.out.println(
          "Enterthe coefficients of the linear equation (ax+ b = 0):"
        );
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0) {
          System.out.println("Invalid equation");
        } else {
          double root = -b / a;
          System.out.println("The root is: " + root);
        }
        break;
      case 2:
        System.out.println(
          "Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):"
        );
        a = sc.nextDouble();
        b = sc.nextDouble();
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1, root2;
        if (discriminant > 0) {
          root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
          root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
          System.out.println("Roots are real and different.");
          System.out.println("First root = " + root1);
          System.out.println("Second root = " + root2);
        } else if (discriminant == 0) {
          root1 = -b / (2 * a);
          System.out.println("Roots are real and same.");
          System.out.println("First root = " + root1);
        } else {
          double realPart = -b / (2 * a);
          double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
          System.out.println("Roots are complex and different.");
          System.out.println(
            "First root = " + realPart + "+" + imaginaryPart + "i"
          );
          System.out.println(
            "Second root = " + realPart + "-" + imaginaryPart + "i"
          );
        }
        break;
      case 3:
        System.out.println(
          "Enterthe coefficients ofthe cubic equation (ax^3 +bx^2 + cx + d = 0):"
        );
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double d1 = sc.nextDouble();
        // Find the discriminant
        double f = (3 * c1 / a1 - (b1 * b1) / (a1 * a1)) / 3;
        double g =
          (
            2 *
            (b1 * b1 * b1) /
            (a1 * a1 * a1) -
            (9 * b1 * c1) /
            (a1 * a1) +
            (27 * d1) /
            a1
          ) /
          27;
        double h = (g * g / 4) + (f * f * f / 27);
        if (h > 0) {
          // One real root
          double R = -(g / 2) + Math.sqrt(h);
          double S = Math.cbrt(R);
          double T = -(g / 2) - Math.sqrt(h);
          double U = Math.cbrt(T);
          double x1 = (S + U) - (b1 / (3 * a1));
          System.out.println("The root is: " + x1);
        } else if (h == 0) {
          // Three real roots
          double R = -(g / 2);
          double S = Math.cbrt(R);
          double T = -(g / 2);
          double U = Math.cbrt(T);
          double x1 = (S + U) - (b1 / (3 * a1));
          double x2 = -(S + U) / 2 - (b1 / (3 * a1));
          double x3 = x2;
          System.out.println("The roots are: " + x1 + " , " + x2 + " , " + x3);
        } else {
          // Three complex roots
          double i = Math.sqrt((g * g / 4) - h);
          double j = Math.cbrt(i);
          double k = Math.acos(-g / (2 * i));
          double L = -j;
          double M = Math.cos(k / 3);
          double N = Math.sqrt(3) * Math.sin(k / 3);
          double P = (b1 / (3 * a1)) * -1;
          double x1 = 2 * j * Math.cos(k / 3) - (b1 / (3 * a1));
          double x2 = L * (M + N) + P;
          double x3 = L * (M - N) + P;
          System.out.println(
            "The roots are: " + x1 + " + i" + x2 + " + " + x3 + "i"
          );
          break;
        }
    }
  }
}
