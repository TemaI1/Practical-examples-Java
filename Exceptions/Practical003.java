// Exception

package Exceptions;

public class Practical003 {
    public static void main(String[] args) throws Exception {
        int[] mayArray1 = {13, 17, 12, 16, 14};
        int[] mayArray2 = {4, 8, 3, 7, 5};
        int mayLengthArray = 5;

        difNum(mayArray1, mayArray2, mayLengthArray); 
        System.out.println();
        multNum(mayArray1, mayArray2, mayLengthArray);
    }

    public static void difNum(int[] array1, int[] array2, int lengthArray) throws Exception {
        int[] result = new int[lengthArray];
        if (array1.length == 0 || array2.length == 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Warning: Ваш массив пуст");
            }
        }
        if (array1.length != lengthArray || array2.length != lengthArray) {
            throw new Exception("Warning: Длина массивов отличается");
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] - array2[i];
            System.out.print(result[i] + " ");
        }
    }

    public static void multNum(int[] array1, int[] array2, int lengthArray) throws RuntimeException {
        int[] result = new int[lengthArray];
        if (array1.length != lengthArray || array2.length != lengthArray) {
            throw new RuntimeException("Warning: Длина массивов отличается");
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] * array2[i];
            System.out.print(result[i] + " ");
        }
    }
}
