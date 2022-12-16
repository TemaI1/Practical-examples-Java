// Поиск значения элемента массива, по индексу

package Exceptions;

public class Practical002 {

    public static void main(String[] args) throws Exception {
        int[] mayArray = {1, 9, 3, 10, 5, 8};
        int mayIndex = 3;

        method(mayArray, mayIndex);

    }

    public static void method(int[] array, int index) throws Exception {
        if (array.length < 8) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Warning: Ваш массив слишком мал");
            }
        }
        if (array.length == 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Warning: Ваш массив пуст");
            }
        }
        if (array.length <= index) {
            throw new Exception("Error: Такого элемента не существует");
        }
        else System.out.println("Ваше число: " + array[index]);
    }
        
}
