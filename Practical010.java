// break and continue

public class Practical010 {
    public static void main(String[] args) {
        int num = 0;
        while(true){
            if(num == 10){
                break;
            }
            num++;
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i <= 15; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
