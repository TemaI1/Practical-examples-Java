// Проверка числа

package Exceptions;

import java.util.Scanner;

public class Practical004 {

    public static void main(String[] args) {
        System.out.println("Введите дробное число: ");
        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                Float num = Float.parseFloat(scan.nextLine());
                System.out.println("Отлично, это число: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Это не дробное число! \nВведите число повторно: ");
            }
        }
    }
}
