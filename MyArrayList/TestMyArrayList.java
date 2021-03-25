package HomeWork.MyArrayList;

import java.util.ArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        //1 add
        for (int i = 0; i < 20; i++) {
            myArrayList.add(i);
        }
        //4 size
        System.out.println(myArrayList.size());
        //5 get
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList);
        //2 remove
        System.out.println(myArrayList.remove(3));
        // 4 size
        System.out.println(myArrayList.size());
        System.out.println(myArrayList);
        // 3 clear
        myArrayList.clear();
        System.out.println(myArrayList);

    }

}
