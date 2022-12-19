// Примеры Exceptions

package Exceptions;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class lesson6 {
    public static void main(String[] args) {

        // // ArithmeticException
        // int num = (1 / 0);

        // // ArrayIndexOutOfBoundsException
        // int[] array = new int[2];
        // System.out.println(array[2]);

        // // NullPointerException
        // String name = null;
        // System.out.println(name.length());

        // // ClassCastException
        // Object name = new String("Artem");
        // File file = (File) name;
        // System.out.println(file);

        // // NumberFormatException
        // String age = "24, Artem";
        // int result = Integer.parseInt(age);
        // System.out.println(result);

        // // UnsupportedOperationException
        // List<Object> mayList = Collections.emptyList();
        // mayList.add(new Object());

    }
}
