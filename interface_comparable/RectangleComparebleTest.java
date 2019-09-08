package interface_comparable;

import inteface_Comparator.Rectangle;

import java.util.Arrays;

public class RectangleComparebleTest {

    public static void main(String[] args) {
        RectangleComparable[] rectangle = new RectangleComparable[3];
        rectangle[0] = new RectangleComparable();
        rectangle[1] = new RectangleComparable(3,5);
        rectangle[2] = new RectangleComparable(2,4);
        System.out.println("Before sort :");
        for (Rectangle r: rectangle) {
            System.out.println(r);
        }
        Arrays.sort(rectangle);
        System.out.println("After sort : ");
        for (Rectangle r :rectangle) {
            System.out.println(r);
        }

    }
}
