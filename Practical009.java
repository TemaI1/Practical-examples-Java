// Пользователь должен ввести число и получить ответ если это число совпадает с загаданным  

import java.util.Scanner;

public class Practical009 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Введите число 123: ");
            num = myScanner.nextInt();
        }while(num != 123);
        System.out.println("Все супер!");
        myScanner.close();
    }
}
