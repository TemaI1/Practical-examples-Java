package Extends;

public class Dog extends Animals {
    
    public void someName(){
        System.out.println(super.name);
    }

    public void bark(){
        System.out.println("I am barking");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
}
