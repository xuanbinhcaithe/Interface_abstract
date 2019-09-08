package inteface_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.3);
        circles[1] = new Circle();
        circles[2] = new Circle(2.4);
        for (Circle c:circles) {
            System.out.println(c);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After sorted :");
        for (Circle c:circles) {
            System.out.println(c);
        }
    }
}
