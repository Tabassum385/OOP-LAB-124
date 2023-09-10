
package task_2;


public class Triangle implements Shape {
    private double b;
    private double h;

    public Triangle(double base, double height) {
        this.b= base;
        this.h = height;
    }

    public double getArea() {
        return 0.5 * b * h;
    }
} 
