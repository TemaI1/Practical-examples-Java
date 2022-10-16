// Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;
public class Practical002 {

    public static void main(String[] args) {
        // int N = 5;
        // int result = (N * (N + 1)) / 2;
        // System.out.println(result);

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите значение N треугольного числа: ");
        int N = iScanner.nextInt();
        int result = (N * (N + 1)) / 2;
        System.out.println("Треугольное число от " + N + " равняется " + result);
        iScanner.close();
    }
}
