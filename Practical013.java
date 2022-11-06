// classes, objects, methods

public class Practical013 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.user("Roman", 32);
        person1.speak();
        int years1 = person1.calcYears();
        System.out.println("До пенсии: " + years1);

        Person person2 = new Person();
        person2.name = "Artem";
        person2.age = 24;
        person2.speak();
        int years2 = person2.calcYears();
        System.out.println("До пенсии: " + years2);
    }
}

class Person{
    String name;
    int age;

    void user(String userName, int userAge){
    name = userName;
    age = userAge;
    }

    void speak(){
    System.out.println("Я " + name + ", мне " + age + " года" );
    }

    int calcYears(){
    int years = 65 - age;
    return years;
    }
}

