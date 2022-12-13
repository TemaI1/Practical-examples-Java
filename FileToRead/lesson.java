package FileToRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) throws FileNotFoundException {

        // // Для работы с разными ОС указывать разделитель(/) separator
        // String separator = File.separator;
        // String path = separator + "Users" + separator + "FileToRead" + separator + "test.txt";

        String path = "/test3.txt";
        
        File file = new File(path);

        // // Выведет все строки, path = test.txt
        // Scanner scanner = new Scanner(file);
        // while(scanner.hasNextLine()){
        //     System.out.println(scanner.nextLine());
        // }
        // scanner.close();



        // // Выведет все строки и запишет в массив, path = test2.txt
        // Scanner scanner = new Scanner(file);
        // String line = scanner.nextLine();
        // String[] words = line.split(" ");
        // System.out.println(Arrays.toString(words));
        // scanner.close();



        // Выведет все строки, запишет в массив, преобразует в int, path = test3.txt
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int[] numbers = new int[3]; 
        int counter = 0;

        for (String string : numbersString) {
            numbers[counter++] = Integer.parseInt(string);
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();

    }
}
