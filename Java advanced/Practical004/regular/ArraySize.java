package ru.lesson.practical004.regular;

public class ArraySize {
    public static void getArray(int[] array, int num) throws MyArraySizeException {
        if (array.length < num) throw new MyArraySizeException("Ваш массив больше числа, назначенного на исключение");
    }

    public static void getStrArray(String[][] array) throws MyArraySizeException {
        if (array.length == 0) throw new MyArraySizeException("Пустой массив");
    }

}
