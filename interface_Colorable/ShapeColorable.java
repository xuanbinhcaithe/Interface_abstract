package interface_Colorable;

public class ShapeColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(2);
        shape[1] = new Rectangle(2,3);
        shape[2] = new Rectangle();
        shape[3] = new Square(3);
        for (Shape s:shape) {
            System.out.println(s);
            if (s instanceof Square) {
                ((Square) s).howToColor();
            }
        }


    }
}
