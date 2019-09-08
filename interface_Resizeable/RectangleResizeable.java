package interface_Resizeable;

import inteface_Comparator.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable() {
    }

    public RectangleResizeable(double width, double height) {
        super(width, height);
    }


    @Override
    public void resize(int percent) {
        super.setWidth(super.getWidth()*percent);
        super.setHeight(super.getHeight()*percent);
    }
}
