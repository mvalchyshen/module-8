package HomeWork.MyLinkedList;

public class TestMylinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        for (int i = 0; i < 13; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        System.out.println(list1.size());
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.get(0));
        list1.clear();
        System.out.println(list1.size());
        System.out.println(list1);
    }
}
