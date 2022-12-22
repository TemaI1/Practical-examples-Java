// Проверка строки

package Exceptions;

import java.util.Scanner;

public class Practical005 {

    public static void main(String[] args) throws Exception{
        System.out.println("Введите любое значение: ");
        Scanner scan = new Scanner(System.in);
        String result = (scan.nextLine());

        if (result == null || result.isEmpty() || result.equals(" ")) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ваша строка пуста!");
            }
        }
        else{
            System.out.println("Ваша строка: " + result);
        }
            
    }
}
