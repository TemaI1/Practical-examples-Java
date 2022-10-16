// Сортировка пузырьком and выбором

public class Practical003 {

    static void bubble(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j + 1] < array[j]){
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    static void selection(int[] array){
        for (int i = 0; i < array.length; i++){
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static void main(String args[]) {
        int[] my_array_bubble = {45, 34, 2, 78, 12};
        System.out.print("\n" + "Начальный массив (пузырьком): ");
        for(int i = 0; i < my_array_bubble.length; i++){
            System.out.print(my_array_bubble[i] + " ");
        }
        bubble(my_array_bubble);
        System.out.print("\n" + "Конечный массив (пузырьком): ");
        for(int i = 0; i < my_array_bubble.length; i++){
            System.out.print(my_array_bubble[i] + " ");
        }

        int[] my_array_select = {7, 45, 86, 12, 76};
        System.out.print("\n" + "Начальный массив(выбором): ");
        for(int i = 0; i < my_array_select.length; i++){
            System.out.print(my_array_select[i] + " ");
        }
        selection(my_array_select);
        System.out.print("\n" + "Конечный массив(выбором): ");
        for(int i = 0; i < my_array_select.length; i++){
            System.out.print(my_array_select[i] + " ");
        }
    }
}

