// toString

public class Practical022 {
    public static void main(String[] args) {
        Man m1 = new Man("Artem", 24);
        System.out.println(m1);
    }
}

class Man {
    String name;
    int age;

    Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + ", " + age;
    }
}