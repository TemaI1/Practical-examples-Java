// Проверка числа

package Exceptions;

import java.util.Scanner;

public class Practical001 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                int num = Integer.parseInt(scan.nextLine());
                System.out.println("Отлично, это число!");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
