package inteface_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle();
        rectangles[3] = new Rectangle(1,0.5);
        rectangles[1] = new Rectangle(2,4);
        rectangles[2] = new Rectangle(3,5);
        for (Rectangle r:rectangles) {
            System.out.println(r);
        }
        System.out.println("After sorted :");
        Comparator rec = new RectangleComparator();
        Arrays.sort(rectangles,rec);
        for (Rectangle r:rectangles) {
            System.out.println(r);
        }

    }

}
