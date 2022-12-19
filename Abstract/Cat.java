package Abstract;

public class Cat extends Animals{
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void speakAnimal() {
        System.out.println("meow");
    }
}
