//Алгоритм поиска нужного числа последовательности Фибоначчи.
public class Practical4 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
//Рекурсия
    public static int fib(int number){
        if (number <= 2) {
            return 1;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }
}
