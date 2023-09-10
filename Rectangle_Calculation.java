package lab_work2;

public class Rectangle_Calculation {
    
  public static void main(String[] args) {
    
    Shape rectangle = new Rectangle(20, 15);
    
    
    System.out.println("\nArea and perimeter of various shapes:");
    System.out.println("\nRectangle: Length-20,Width-15");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());
}
}
