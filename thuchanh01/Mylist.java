package data_contructures.mylist.thuchanh01;

import java.util.Arrays;

public class Mylist<A> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;
    public Mylist() {
        element = new  Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa() {
        int newsize = element.length*2;
        element = Arrays.copyOf(element,newsize);
    }
    public void add(A e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }
    public A get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("sai roi");
        }
        return (A)element[i];
    }


}