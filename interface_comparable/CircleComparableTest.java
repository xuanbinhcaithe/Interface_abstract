package interface_comparable;

import java.util.Arrays;

public class CircleComparableTest {
    public static void main(String[] args) {
        CircleComparable[] circles= new CircleComparable[3];
        circles[0] = new CircleComparable();
        circles[1] = new CircleComparable(2);
        circles[2] = new CircleComparable(1.5);
        for (CircleComparable c: circles) {
            System.out.println(c);
        }

        Comparable comparable = new CircleComparable();
        Arrays.sort(circles);
        System.out.println("After sort :");
        for (CircleComparable c : circles) {
            System.out.println(c);
        }

    }
}
