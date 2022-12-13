package WildcardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class lesson {

    public static void main(String[] args) {
        List<Animals> listAnimal = new ArrayList<>();
        listAnimal.add(new Animals(1));
        listAnimal.add(new Animals(2));

        List<Dog> listDog = new ArrayList<>();
        listDog.add(new Dog());
        listDog.add(new Dog());

        test(listAnimal);
        test(listDog);

    }

    private static void test(List<?  extends Animals> list){
        for (Animals animals : list) {
            System.out.println(animals);
            animals.eat();
        }
    }
}
