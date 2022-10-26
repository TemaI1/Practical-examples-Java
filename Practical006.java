// Волновой алгоритм

public class Practical006 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1; // заполнение массива единицами 
                array[1][1] = 0; // start
                array[3][3] = 0; // end
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}