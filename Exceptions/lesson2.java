// Выбрасывание исключений

package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("Введите число меньше 10: ");
        Scanner scan = new Scanner(System.in);

        while(true){
            int num = Integer.parseInt(scan.nextLine());

            if(num >= 10){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }

    }
}
