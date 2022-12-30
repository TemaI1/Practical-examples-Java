package Enum;

public class Test {
    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int FROG = 2;

    public static void main(String[] args) {
        int animal = 0;

        switch(animal){
            case DOG: 
                System.out.println("It is a dog");
                break;
            case FROG:
                System.out.println("It is a frog");
                break;
            default:
                System.out.println("It is not animal");
        }
    }
}
