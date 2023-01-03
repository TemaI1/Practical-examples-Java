// list

import java.util.ArrayList;
import java.util.List;

public class Practical027 {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);
        arrayList.remove(15); // удалить 15 элемент
        System.out.println(arrayList.get(5)); // получить 5 элемент
        System.out.println(arrayList.size()); // получить размер листа

        // получить каждый элемент
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        for (Integer x : arrayList) {
            System.out.print(x + " ");
        }


    }
}
