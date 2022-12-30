package Enum;

public class lesson {
    public static void main(String[] args) {
        EnumAnimal animal = EnumAnimal.DOG;
        switch (animal) {
            case CAT:
                System.err.println("It is a cat");
                break;
            case DOG: 
                System.out.println("It is a dog");
                break;
            case FROG:
                System.out.println("It is a frog");
                break;
            default:
                System.out.println("It is not animal");
        }

        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());

        EnumAnimal frog = EnumAnimal.valueOf("FROG"); // получение enum из строки
        System.out.println(frog.getTranslation()); 
        System.out.println(frog.ordinal()); // индекс, где объявлена 

        // enum Season { WINTER, SPRING, SUMMER, AUTUMN }
        // Season season = Season.SPRING;
        // if (season == Season.SPRING) {season = Season.AUTUMN;}
        // System.out.println(season);

        // System.out.println(season instanceof Season); // проверяет, был ли объект создан на основе какого-либо класса
        // System.out.println(season instanceof Enum);
        // System.out.println(season instanceof Object);
        // System.out.println(season.getClass());
    }
}
