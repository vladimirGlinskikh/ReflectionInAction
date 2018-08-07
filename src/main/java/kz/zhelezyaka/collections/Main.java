package kz.zhelezyaka.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class Main {
    private static void reflectionCollections(Object ref) {
        if (ref instanceof Collection) {
            System.out.println("A collection: " + ref.getClass().getName());
            @SuppressWarnings("rawtypes")
            Iterator iterator = ((Collection) ref).iterator();
            while (iterator.hasNext()) {
                Object item = iterator.next();
                System.out.println("Element of the collection: " + item.getClass().getName());
            }
        } else {
            System.out.println("Not a collection: " + ref.getClass().getName());
        }
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "Spring");
        map.put("2", "Hibernate");
        map.put("3", "PostgreSQL");
        map.put("4", "Java");

        reflectionCollections(map);
        reflectionCollections(map.keySet());
        reflectionCollections(map.values());

        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");

        reflectionCollections(list);
        reflectionCollections("this is an string");
    }
}
