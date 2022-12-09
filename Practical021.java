// StringBuilder, print(ln,f)

public class Practical021 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friends");
        System.out.println(sb.toString());

        System.out.printf("Если %.2f %s с %d получим %f", 10.56521, "сложить", 5, 15.56521);

        System.out.printf("\n Число будет занимать 10 символов %10d, %-10d и в другую сторону", 123, 456);
    }
}
