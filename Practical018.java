// static

public class Practical018 {
    public static void main(String[] args) {
        Human human1 = new Human("Artem", 24);
        human1.printNumPeople();
        Human human2 = new Human("Misha", 19);
        human2.printNumPeople();

        Human.typeHuman = "Nice";
        Human.printTypeHuman();
        Human.typeHuman = "Good";
        Human.printTypeHuman();
    }
}

class Human{
    private String name;
    private int age;

    private static int countPeople;
    public static String typeHuman;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printNumPeople(){
        System.out.println("num people: " + countPeople);
    }
    public static void printTypeHuman(){
        System.out.println(typeHuman);
    }
}
