package inteface_Comparator;

public class Rectangle {
    private double width = 1.0;
    private double height = 2.0;
    public Rectangle() {

    }
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "The rectangle with width = " + getWidth() + " and height = " + getHeight() +" have area " + getArea();
    }
}
