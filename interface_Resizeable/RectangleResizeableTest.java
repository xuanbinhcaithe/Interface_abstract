package interface_Resizeable;

public class RectangleResizeableTest {

    public static void main(String[] args) {
        RectangleResizeable[] rectangles = new RectangleResizeable[3];
        rectangles[0] = new RectangleResizeable();
        rectangles[1] = new RectangleResizeable(2,4);
        rectangles[2] = new RectangleResizeable(3,2);
        for (RectangleResizeable r:rectangles) {
            System.out.println(r);
        }

        for (RectangleResizeable r : rectangles) {
            r.resize((int)(Math.random()*100));
        }

        System.out.println("After resizeable :" );
        for (RectangleResizeable r :rectangles) {
            System.out.println(r);
        }
    }
}
