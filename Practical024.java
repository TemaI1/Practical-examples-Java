// equals

public class Practical024 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        Animal animal3 = new Animal(2);
        Animal animal4 = animal3;
        System.out.println(animal3 == animal4);

        String string1 = "Hello";
        String string2 = new String("Hello");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        String string3 = "Hello";
        String string4 = "Hello123".substring(0, 5);
        System.out.println(string3 == string4);
        System.out.println(string3.equals(string4));
    }
}

class Animal {
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }

}
