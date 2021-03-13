package module8.HomeWork.MyLinkedList;

import java.util.LinkedList;

public class TestMylinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.get(0));
        list1.clear();
        System.out.println(list1.size());
        System.out.println(list1);
    }
}
