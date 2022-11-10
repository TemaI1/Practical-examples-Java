// constructor

public class Practical017 {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("Artem", 24);
    }
}

class Human{
    String name;
    int age;

    public Human(){
        System.out.println("Hello, standard constructor");
    }
    public Human(String name, int age){
        System.out.println("Hello, second constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
