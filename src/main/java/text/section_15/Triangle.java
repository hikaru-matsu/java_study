package text.section_15;

public class Triangle {

  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
    if(!isValidTriangle(side1, side2, side3)) {
      throw new IllegalArgumentException("三角形の条件を満たしていません。");
    }
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  private boolean isValidTriangle(double side1, double side2, double side3) {
    return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
  }

  public double calculateArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  public static void main(String[] args) {
    try{
      Triangle triangle = new Triangle(3, 4, 5);
      System.out.println("三角形の面積: " + triangle.calculateArea());
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
