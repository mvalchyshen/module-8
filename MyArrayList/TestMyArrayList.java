package module8.HomeWork.MyArrayList;

import java.util.ArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        //1 add
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        //4 size
        System.out.println(myArrayList.size());
        //5 get
        System.out.println(myArrayList.get(3));
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
