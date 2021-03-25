package HomeWork.MyHashMap;

import java.util.HashMap;
import java.util.Map;

public class TestMyHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Maksym");
        map1.put(2,"Vadym");
        map1.put(3,"Kolya");
        map1.put(4,"Ira");
        map1.put(5,"Julia");
        map1.put(6,"Galya");
        map1.put(null,"Galya");
        map1.put(0,"Galya");
        System.out.println(map1);
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(1,"Maksym");
        map.put(2,"Vadym");
        map.put(3,"Kolya");
        map.put(4,"Ira");
        map.put(5,"Julia");
        map.put(6,"Galya");
        map.put(null,"Galya");
        //map.put(0,"Galya");
        map.put(6,"Vlada");
        System.out.println(" Мапа " + map + " ; "
                + "Сайз" + map.size() + " ; "
                + "NULL Patien = " + map.get(null));

    }
}
