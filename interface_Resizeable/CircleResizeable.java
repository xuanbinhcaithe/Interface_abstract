package interface_Resizeable;

import inteface_Comparator.Circle;

public class CircleResizeable extends Circle implements Resizeable {
    public CircleResizeable() {
    }

    public CircleResizeable(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        setRadius(super.getRadius()*percent);
    }
}
