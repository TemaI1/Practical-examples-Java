// Реализовать алгоритм сортировки вставками

public class Practical005 {

    static void sort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
    }
    public static void main(String args[]) {
        int[] array = {9, 6, 4, 1, 2, 5};

        System.out.print("\n" + "Начальный массив: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        sort(array);
        System.out.print("\n" + "Конечный массив: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}