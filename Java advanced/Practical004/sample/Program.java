package ru.lesson.practical004.sample;

import ru.lesson.practical004.regular.ArraySize;
import ru.lesson.practical004.regular.MyArraySizeException;

public class Program {
    public static void main(String[] args) throws MyArraySizeException {

        int[] array = {3, 7 ,4, 5, 8};
        try {
            // проверка ArithmeticException
            int num = 0;
            array[num] = 4/num;
            // проверка ArrayIndexOutOfBoundsException
            int num2 = 5;
            array[num2] = 4/num2;
        } catch (ArithmeticException ex) {
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Обращение по недопустимому индексу массива");
        }


        int[] array2 = {2, 7 ,3, 1};
        // проверка созданного MyArraySizeException
        try {
            ArraySize.getArray(array2, 6);
            PrintArray(array2);
        }catch(MyArraySizeException ex){
            System.out.println(ex.getMessage());
        }


        // заполнение двумерного строкового массива
        String[][] arrayStr = {
                {"Back to the future", "Some like it hot", "The sixth sense"},
                {"Intouchables", "The silence of the lambs", "The Godfather"},
                {"Catch me if you can", "One flew over the Cuckoo’s nest", "Braveheart"}};
        String[][] arrayStr2 = new String[0][0];
        // проверка созданного MyArraySizeException
        try {
            ArraySize.getStrArray(arrayStr2);
            PrintSecondArray(arrayStr2);
        }catch(MyArraySizeException ex){
            System.out.println(ex.getMessage());
        }
    }

    // вывод числового массива
    public static void PrintArray(int[] array){
        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
    }

    // вывод двумерного строкового массива
    public static void PrintSecondArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

}
