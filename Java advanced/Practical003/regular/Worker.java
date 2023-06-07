package ru.lesson.practical003.regular;

public class Worker extends BaseWorker implements BaseInterfaces{

    public static double Random(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public Worker(String name, int age, String roleGame) {
        super(name, age, roleGame);
    }

    @Override
    public String toString() {
        return "Worker: " + "name: " + name + ", age: " + age +  ", roleGame: " + roleGame;
    }

    @Override
    public void InfoSalary() {
        System.out.println(name + " получает зарплату в размере: " + Random(150000, 250000) + " российских рублей");
    }

    @Override
    public void InfoPosition() {
        System.out.println(name + " занимет роль: " + roleGame+ " команды");
    }
}
