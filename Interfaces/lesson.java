package Interfaces;

public class lesson {
    public static void main(String[] args) {
        Animals animal1 = new Animals(1);
        Person person1 = new Person("Artem");
        animal1.showInfo();
        animal1.sleep();
        person1.showInfo();
        person1.sayHello();
        outputInfo(animal1);
        outputInfo(person1);

        BaseInterfaces info1 = new Animals(2);
        BaseInterfaces info2 = new Person("Bob");
        info1.showInfo(); 
        info2.showInfo();

        BaseInterfaces info3 = new Animals(3);
        BaseInterfaces info4 = new Person("Mark");
        outputInfo(info3);
        outputInfo(info4);
    }

    public static void outputInfo(BaseInterfaces info){
        info.showInfo();
    }
    
}
