package inteface_Comparator;

public class Circle {
    double radius = 1;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "The circle with radius = " + this.getRadius() + " have  area = " + getArea();
    }
}
