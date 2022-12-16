// Checked и Unchecked исключения

package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {

        // Checked(compile time exception) - исключительные случаи в работе программы 
        File file = new File("/test");
        try {
            Scanner scan = new Scanner(file);
            System.out.println("File exists");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // Unchecked(runtime exceptions) - ошибка в работе программы 
        int num = (1 / 0);

        String name = null;
        name.length();

        int[] array = new int[2];
        System.out.println(array[2]);
    }
}
