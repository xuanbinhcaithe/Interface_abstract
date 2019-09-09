package data_contructures.mylist.thuchanh01;

public class MylistTest {
    public static void main(String[] args) {
        Mylist<Integer> integerMylist = new Mylist<Integer>();
        integerMylist.add(5);
        integerMylist.add(3);
        integerMylist.add(2);
        integerMylist.add(6);

        System.out.println(integerMylist.get(3));
        System.out.println(integerMylist.get(2));
        System.out.println(integerMylist.get(7));


    }

}
