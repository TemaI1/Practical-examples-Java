// Обработка исключений

package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        File file = new File("/test");

        try {
            Scanner scan = new Scanner(file);
            System.out.println("File exists");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        try {
            readFile();
            System.out.println("File exists");
        } catch (FileNotFoundException e) {
            System.out.println("File not found"); //e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException{
        File file2 = new File("/test2");
        Scanner scan2 = new Scanner(file2);

    }
}
