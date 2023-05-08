// yandex job

import java.util.Scanner;

public class Practical032 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение N (количество скульптур): ");
        int n = scan.nextInt();
        System.out.print("Введите значение X (идеальное количество льда): ");
        int x = scan.nextInt();
        System.out.print("Введите значение T (количество минут до праздника): ");
        int t = scan.nextInt();

        System.out.print("Введите(через пробел) количество льда для " + n + " фигур: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt() - x;
            if (array[i] < 0) {
                array[i] = array[i] * -1;
            }
        }
        scan.close();

        bubbleSort(array);

        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (t > 0) {
                t = t - array[i];
                result++;
            }
        }
        System.out.println("количество идеальных фигур: " + result);
        

    }

    public static void bubbleSort(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]){
                    int save = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = save;
                }
            }
        }
    }
}