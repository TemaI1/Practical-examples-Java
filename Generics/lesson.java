package Generics;

import java.util.ArrayList;
import java.util.List;

public class lesson {

    public static void main(String[] args) {

        // not used Generics
        List animal = new ArrayList();
        animal.add("cat");
        animal.add(10);

        String result = (String) animal.get(0);
        Integer result2 =  (Integer) animal.get(1);
        System.out.println(result + ", " + result2);


        // is used Generics
        List<String> animal2 = new ArrayList<>();
        animal2.add("dog");
        animal2.add("fox");

        String result3 = animal2.get(0);
        String result4 = animal2.get(1);
        System.out.println(result3 + ", " + result4);

    }
}