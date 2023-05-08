// yandex job

import java.util.Scanner;

public class Practical033 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение N (количество дней): ");
        int n = scan.nextInt();

        System.out.print("Введите(через пробел) стоимость акций в каждый день: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
   
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            } else if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("покупка: " + min);
        System.out.println("продажа: " + max);
    }
}