// yandex job

import java.util.Scanner;

public class Practical034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение N (количество стран): ");
        int n = scan.nextInt();

        System.out.print("Введите(через пробел) минимальный доход для " + n + " стран: ");
        int[] arrayA = new int[n];
        arrayCreation(arrayA);

        System.out.print("Введите(через пробел) образование: 1 или 0 (1-присутствует, 0-отсутствует): ");
        int[] arrayB = new int[n];
        arrayCreation(arrayB);

        System.out.print("Введите значение Q (количество одноклассников, не пришедших на выпускной): ");
        int q = scan.nextInt();

        System.out.print("Введите(через пробел) доход для каждого одноклассника: ");
        int[] arrayX = new int[q];
        arrayCreation(arrayX);

        System.out.print("Введите(через пробел) наличие образования: 1 или 0 (1-присутствует, 0-отсутствует): ");
        int[] arrayY = new int[q];
        arrayCreation(arrayY);

        scan.close();

        if (arrayX[0] > arrayA[0]){
            if (arrayY[0] == arrayB[0]) {
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }else if (arrayX[1] > arrayA[1]){
            if (arrayY[1] == arrayB[1]){
                System.out.println("2");
            }else{
                System.out.println("0");
            }
        }else{
            System.out.println("0");
        }

    }

    public static void arrayCreation(int[] array){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
    }
}