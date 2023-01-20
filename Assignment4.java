import java.util.Scanner;

class Complex {
  //for real and imaginary parts of complex numbers
  double real, img;

  //constructor to initialize the complex number
  Complex(double r, double i) {
    this.real = r;
    this.img = i;
  }

  public static Complex sum(Complex c1, Complex c2) {
    //creating a temporary complex number to hold the sum of two numbers
    Complex temp = new Complex(0, 0);

    temp.real = c1.real + c2.real;
    temp.img = c1.img + c2.img;

    //returning the output complex number
    return temp;
  }

  public static Complex multiply(Complex c1, Complex c2) {
    //creating a temporary complex number to hold the sum of two numbers
    Complex temp = new Complex(0, 0);

    temp.real = c1.real * c2.real - c1.img * c2.img;
    temp.img = c1.real * c2.img + c1.img * c2.real;

    //returning the output complex number
    return temp;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter real part for C1: ");
    double real1 = sc.nextDouble();
    System.out.print("Enter imaginary part for C1: ");
    double img1 = sc.nextDouble();
    System.out.print("Enter real part for C2: ");
    double real2 = sc.nextDouble();
    System.out.print("Enter imaginary part for C2: ");
    double img2 = sc.nextDouble();
    Complex c1 = new Complex(real1, img1);
    Complex c2 = new Complex(real2, img2);
    Complex tempMultiply = multiply(c1, c2);
    Complex tempSum = sum(c1, c2);
    System.out.println("Sum is: " + tempSum.real + " + " + tempSum.img + "i");
    System.out.println("Product is: " + tempMultiply.real + " + " + tempMultiply.img + "i");
  }
}
