//Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N.
public class Practical2 {
    public static void main(String[] args) {
        simple(50);
    }
    public static void simple(int number){
        boolean boolean_simple = true;
        for (int i = 2; i <= number; i++) {
            boolean_simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    boolean_simple = false;
                    break;
                }
            }
            if (boolean_simple == true) {
                System.out.println(i);
            }
        }
    }
}
