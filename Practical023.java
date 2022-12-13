// Анонимные классы

public class Practical023 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal(){
            public void eat(){
                System.out.println("Other animal is eating");
            }
        };
        animal2.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat2(){
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat2();
    }
}

class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}

interface AbleToEat {
    public void eat2();
}
