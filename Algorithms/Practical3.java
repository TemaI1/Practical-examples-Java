//Необходимо написать алгоритм поиска всех доступных комбинаций для количества кубиков (количество кубиков строго ограничено).
public class Practical3 {
    public static void main(String[] args) {
        cube_one(6);
    }
    public static void cube_one(int facet){
        int count = 0;
        for (int i = 0; i <= facet; i++) {
            for (int j = 0; j <= facet; j++) {
                for (int k = 0; k <= facet; k++) {
                    for (int l = 0; l <= facet; l++) {
                        System.out.printf("%d %d %d %d\n", i, j, k, l);
                        count++;
                    }
                }
            }
        }
        System.out.print("Number of combinations: " + count);
    }
}
