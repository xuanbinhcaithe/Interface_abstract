package interface_comparable;

import inteface_Comparator.Rectangle;

public class RectangleComparable extends Rectangle implements Comparable<RectangleComparable> {
    public RectangleComparable() {
    }

    public RectangleComparable(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(RectangleComparable r) {
        if (getArea() > r.getArea()) return 1;
        else if (getArea() < r.getArea()) return -1;
        else return 0;
    }
}
