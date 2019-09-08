package interface_Resizeable;

import inteface_Comparator.Circle;

public class CircleResizeableTest {

    public static void main(String[] args) {
        CircleResizeable[] circle = new CircleResizeable[3];
        circle[0] = new CircleResizeable();
        circle[1] = new CircleResizeable(2);
        circle[2] = new CircleResizeable(3);
        for (Circle c :circle) {
            System.out.println(c);
        }
        System.out.println("After resizeable : ");
        for (CircleResizeable c :circle) {
            c.resize((int)(Math.random()*100));
        }
        for (Circle c:circle) {
            System.out.println(c);
        }
    }
}
