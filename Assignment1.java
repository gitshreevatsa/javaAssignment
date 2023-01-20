import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(
      "Enter the number of rows and columns for the first matrix: "
    );
    int rows = scan.nextInt();
    int cols = scan.nextInt();
    Matrix mat1 = new Matrix(rows, cols);
    mat1.setMat();
    System.out.println("The first matrix is: ");
    mat1.readMat();
    System.out.println(
      "Enter the number of rows and columns for the second matrix: "
    );
    rows = scan.nextInt();
    cols = scan.nextInt();
    Matrix mat2 = new Matrix(rows, cols);
    mat2.setMat();
    System.out.println("The second matrix is: ");
    mat2.readMat();
    Matrix mat3 = mat1.addMat(mat2);
    if (mat3 != null) {
      System.out.println("The sum of the two matrices is: ");
      mat3.readMat();
    }
    Matrix mat4 = mat1.multMat(mat2);
    if (mat4 != null) {
      System.out.println("The product of the two matrices is: ");
      mat4.readMat();
    }
    mat1.sortMat();
    System.out.println("The sorted matrix is: ");
    mat1.readMat();
    int min = mat1.minMat();
    System.out.println("The minimum element in the matrix is: " + min);
  }
}

class Matrix {
  private int[][] mat;
  private int rows;
  private int cols;

  public Matrix(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    mat = new int[rows][cols];
  }

  public void setMat() {
    System.out.println("Enter matrix elements:");
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        mat[i][j] = scan.nextInt();
      }
    }
  }

  public void readMat() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void sortMat() {
    for (int i = 0; i < rows; i++) {
      Arrays.sort(mat[i]);
    }
  }

  public int minMat() {
    int min = mat[0][0];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] < min) {
          min = mat[i][j];
        }
      }
    }
    return min;
  }

  public Matrix addMat(Matrix other) {
    if (rows != other.rows || cols != other.cols) {
      System.out.println("Matrix dimensions must match for addition.");
      return null;
    }
    Matrix result = new Matrix(rows, cols);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result.mat[i][j] = mat[i][j] + other.mat[i][j];
      }
    }
    return result;
  }

  public Matrix multMat(Matrix other) {
    if (cols != other.rows) {
      System.out.println(
        "Number of columns in first matrix must match number of rows in second matrix for multiplication."
      );
      return null;
    }
    Matrix result = new Matrix(rows, other.cols);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < other.cols; j++) {
        for (int k = 0; k < cols; k++) {
          result.mat[i][j] += mat[i][k] * other.mat[k][j];
        }
      }
    }
    return result;
  }
}
