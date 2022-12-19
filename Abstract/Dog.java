package Abstract;

public class Dog extends Animals {
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void speakAnimal() {
        System.out.println("bark");
    }
}
