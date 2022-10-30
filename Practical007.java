// Простые задачки

import java.util.Scanner;

public class Practical007 {
    
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // System.out.print("Введите первое число: ");
        // int a = iScanner.nextInt();
        // System.out.print("Введите второе число: ");
        // int b = iScanner.nextInt();
        // iScanner.close();
    
    
    
        // // По двум заданным числам проверить является ли одно квадратом второго
        // int a = 4;
        // int b = 16;
        // if((a * a) == b || a == (b * b)){
        //     System.out.println("Да");
        // }else{
        //     System.out.println("Нет");
        // }
    
    
    
    // // Найти максимальное из пяти чисел
    // int[] array = {2, 4, 5, 7, 5};
    // int max = array[0];
    // for (int i = 0; i < array.length; i++) {
    //     if(array[i] >= max){
    //         max = array[i];
    //     }
    // }
    // System.out.print("Max = " + max);
    
    
    
    // // // Вывести на экран числа от -N до N
    // int n = 5;
    // int count = -n;
    // while(n >= count){
    //     System.out.print(count + " ");
    //     count = count + 1;
    // }
    
    
    
    // // // Дано число. Проверить кратно ли оно 5 и 10 или 15 но не 30
    // int num = 45;
    // if(((num % 5 == 0) && (num % 10 == 0) || (num % 15 == 0)) && (num % 30 != 0)){
    //     System.out.print("Да");
    // }else{
    //     System.out.print("Нет");
    // }
    
    
    
    // // // Дано число обозначающее день недели. Вывести его название и указать является ли он выходным
    // int day_week = 5;
    // if((day_week <= 5) && (day_week >= 1)){
    //     if(day_week == 1)System.out.println("Понедельник, будний день");
    //     if(day_week == 2)System.out.println("Вторник, будний день");
    //     if(day_week == 3)System.out.println("Среда, будний день");
    //     if(day_week == 4)System.out.println("Четверг, будний день");
    //     if(day_week == 5)System.out.println("Пятница, будний день");
    // }else if((day_week >= 6) && (day_week <= 7)){
    //     if(day_week == 6)System.out.println("Суббота, выходной день");
    //     if(day_week == 7)System.out.println("Воскресенье, выходной день");
    // }else{
    //     System.out.println("Такого дня недели не существует");
    // }
    
    
    
    // // // Сформировать список из N членов последовательности. Для N = 5: 1, -3, 9, -27, 81 и т.д.
    // int N = 5;
    // int result = 1;
    // for (int i = 1; i < N + 1; i++) {
    //     System.out.print(result + " ");
    //     result *= -3;
    // }
    
    
    }
}