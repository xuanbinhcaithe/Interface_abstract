package interface_Colorable;

public class Square extends Rectangle implements Colorable{
    public Square() {

    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side ,String color,boolean filled) {
        super(side,side);
        setColor(color);
        setFilled(filled);
    }
    public double getSide() {
       return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setHeight(double height) {
        setSide(height);
    }
    @Override
    public String toString() {
        return " A square " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
