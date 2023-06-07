package ru.lesson.practical003.sample;

import ru.lesson.practical003.regular.Worker;

public class Program {
    public static void main(String[] args) {

        System.out.println("Наши игроки:");

        Worker[] workers = {
                new Worker("Неманья Ковач", 27, "Опорник"),
                new Worker("Никола Ковач", 26, "Энтри-фраггер"),
                new Worker("Илья Осипов", 18, "Снайпер"),
                new Worker("Джастин Сэвэйдж", 28, "Хелпующий"),
                new Worker("Расмус Нилсен", 28, "Капитан")
        };

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }

        System.out.println("Информация игроков:");

        Worker person1 = new Worker("Неманья Ковач", 27, "Опорник");
        person1.InfoSalary();
        person1.InfoPosition();
        Worker person2 = new Worker("Джастин Сэвэйдж", 28, "Хелпующий");
        person2.InfoSalary();
        person2.InfoPosition();

    }
}
