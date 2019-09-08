package interface_comparable;

import inteface_Comparator.Circle;

public class CircleComparable extends Circle implements Comparable<CircleComparable> {

    public CircleComparable() {
    }

    public CircleComparable(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(CircleComparable o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
