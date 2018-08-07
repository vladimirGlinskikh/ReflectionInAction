package kz.zhelezyaka.arrays;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String[] strArrayOne = (String[]) Array.newInstance(String.class, 11);
        Array.set(strArrayOne, 0, "member0");
        Array.set(strArrayOne, 1, "member1");
        Array.set(strArrayOne, 9, "member9");

        System.out.println("strArrayOne[0]: " + Array.get(strArrayOne, 0));
        System.out.println("strArrayOne[1]: " + Array.get(strArrayOne, 1));
        System.out.println("strArrayOne[3] (not initialized): "
                + Array.get(strArrayOne, 3));
        System.out.println("strArrayOne[9]: " + Array.get(strArrayOne, 9));

        System.out.println("length strArrayOne: " + Array.getLength(strArrayOne));

        int[] intArrayOne = (int[]) Array.newInstance(int.class, 10);

        Array.set(intArrayOne, 0, 1);
        Array.set(intArrayOne, 1, 2);
        Array.set(intArrayOne, 9, 10);

        for (int i = 0; i < Array.getLength(intArrayOne); ++i) {
            System.out.println("intArrayOne[" + i + "]: " + Array.getInt(intArrayOne, i));
        }

        Class<String[]> stringArrayClassUsingInstance = String[].class;
        System.out.println("strArrayClassUsingInstance is array: "
                + stringArrayClassUsingInstance.isArray());

        Class<?> intArrayUsingClassFofName = Class.forName("[I");
        System.out.println("intArrayUsingClassForName is array: " +
                intArrayUsingClassFofName.isArray());

        Class<? extends Object> stringArrayClassUsingClassForName =
                Array.newInstance(String.class, 0).getClass();
        System.out.println("stringArrayClassUsingClassForName is array: " +
                stringArrayClassUsingClassForName.isArray());

        Class<? extends Object> stringArrayClassUsingDoubleLoop =
                Array.newInstance(String.class, 0).getClass();
        System.out.println("stringArrayClassUsingDoubleLoop is array: " +
                stringArrayClassUsingDoubleLoop.isArray());
    }
}
