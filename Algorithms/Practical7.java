import java.util.Arrays;
import java.util.Scanner;

public class Practical7 {

    // public static boolean mayMethod(int[] array){
    //     if (array == null || array.length <= 1) {
    //         return true;
    //     }
    //     for (int i = 0; i < array.length - 1; i++){
    //         if (array[i] > array[i + 1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args){
    //     int[] mayArray = {5, 2, 3, 1};
    //     if(mayMethod(mayArray) == true){
    //         System.out.println("YES");
    //     } else {
    //         System.out.println("NO");
    //     }
    // }



    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("число джунов: ");
    //     int n = scan.nextInt();
    //     System.out.print("число сеньоров: ");
    //     int m = scan.nextInt();
    //     System.out.print("необходимых проверок: ");
    //     int k = scan.nextInt();
    //     scan.close();
    //     System.out.println((n * k)/m);
    // }



    // public static boolean isEmpty(String s) {
    //     return s == null || s.length() == 0;
    // }
    // public static int countMatches(String textString, String subString){
    //     if (isEmpty(textString) || isEmpty(subString)) {
    //         return 0;
    //     }
    //     int index = 0, count = 0;
    //     while (true){
    //         index = textString.indexOf(subString, index);
    //         if (index != -1){
    //             count ++;
    //             index += subString.length();
    //         }else {
    //             break;
    //         }
    //     }
    //         return count;
    // }
    // public static void main(String[] args) {
    //     String textString = "aabbccddbadd";
    //     String subString = "a";
 
    //     int count = countMatches(textString, subString);
    //     System.out.println(count);
    // }
    

    
    // public static int[] removeDuplicates(int[] arr) {
    //     return Arrays.stream(arr).distinct().toArray();
    // }
    // public static void main(String[] args) {
    //     int[] array = new int[]{1, 2, 3, 1, 2, 2, 3, 3, 3, 1, 4, 4, 5};
    //     System.out.println(Arrays.toString(removeDuplicates(array)));
    // }



    // public static void bubbleSort(int[] num){
    //     for (int i = 0; i < num.length; i++) {
    //         for (int j = 0; j < num.length - 1 - i; j++) {
    //             if (num[j] > num[j + 1]){
    //                 int save = num[j];
    //                 num[j] = num[j + 1];
    //                 num[j + 1] = save;
    //             }
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] array = new int[]{5, 5, 9, 7, 8, 10, 1};
    //     bubbleSort(array);
    //     int result = 0;
    //     if((array.length) % 2 == 0){
    //         result = (array[(array.length - 1) / 2] + array[(array.length - 1) / 2 + 1]) / 2;
    //     } else{
    //         result = array[(array.length - 1) / 2];
    //     }
    //     if (array.length == 2) {
    //         result = (array[0] + array[1]) / 2;
    //     }
    //     System.out.println(result);
    // }
}

