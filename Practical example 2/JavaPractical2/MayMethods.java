package JavaPractical2;

import java.io.*;
import java.util.Scanner;
import JavaPractical2.AnimalTraining.*;

public class MayMethods {

    public static void Action(){ // Основной метод для запуска
        System.out.print("Наш список команд:\n 1-Завести новое животное,\n 2-Посмотреть досье животного,\n 3-Посмотреть существующие команды,\n 4-Обучить животное новым командам, \n 5-Выход\n Укажите что необходимо сделать: ");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        while(true){
            if (number.equals("1")) { // Завести новое животное
                CreateAnimal();
                break;
            } else if (number.equals("2")){ // Посмотреть животных в наличии
                System.out.print("Введите имя животного: ");
                number = scan.nextLine();
                FileReader(number + ".txt");
                break;
            } else if (number.equals("3")){ // Посмотреть существующие команды
                ExistingWorkouts();
                break;
            } else if (number.equals("4")){ // Обучить животное новым командам
                System.out.print("Укажите имя животного, которого желаете обучить: ");
                String name = scan.nextLine();
                System.out.print("Укажите id команды обучения (1-3): ");
                String team = scan.nextLine();
                TrainAnimal(name + ".txt", team);
                break;
            } else if (number.equals("5")){ // Выход
                System.out.println("Вы покинули программу");
                scan.close();
                break;
            } else {
                System.out.print("Такого значения не существует, повторите попытку: ");
                number = scan.nextLine();
            } 
        }
    }

    public static void CreateAnimal(){ // Создание животного
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя животного, например (Bob): ");
        String name = scan.nextLine();
        System.out.print("Укажите вид вашего животного, например (Dog): ");
        String species = scan.nextLine();
        System.out.print("Укажите возраст животного, например (12): ");
        String age = scan.nextLine(); // int
        System.out.print("Укажите пол животного, например (M): ");
        String gender = scan.nextLine(); // char
        System.out.print("Укажите любимые вкусняшки животного, например (Meat): ");
        String eat = scan.nextLine();
        System.out.println("Спасибо, зафиксировал ваши данные");

        try(FileWriter writer = new FileWriter(name + ".txt", true)){ // Запись в файл
            String text = "name: " + name + ", species: " + species + ", age: " + age + ", gender: " + gender + ", eat: " + eat +" \n";
            writer.write(text);
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void FileReader(String txt){ // Чтение файла
        try(FileReader reader = new FileReader(txt)){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            } 
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }  
    }

    public static void ExistingWorkouts(){ // Создание тренировок
        TeamAport team1 = new TeamAport(1, "Aport", "12 hours", "hard");
        TeamCome team2 = new TeamCome(2, "Come", "5 hours", "easy");
        TeamPlace team3 = new TeamPlace(3, "Place", "7 hours", "normal");

        System.out.println("Список тренировок: ");
        System.out.println(team1.toString() + "\n");
        System.out.println(team2.toString() + "\n");
        System.out.println(team3.toString() + "\n");
    }

    public static void TrainAnimal(String name, String team){ // Добавление новых тренировок для конкретного животного, либо создание файла с тренировкой
        String result;
        TeamAport team1 = new TeamAport(1, "Aport", "12 hours", "hard");
        TeamCome team2 = new TeamCome(2, "Come", "5 hours", "easy");
        TeamPlace team3 = new TeamPlace(3, "Place", "7 hours", "normal");

        if (team.equals("1")) {
            result = team1.toString();
        } else if(team.equals("2")){
            result = team2.toString();
        } else if(team.equals("2")){
            result = team3.toString();
        } else {
            result = "your animal has learned nothing";
        }

        try(FileWriter writer = new FileWriter(name , true)){
            String text = "new skills: " + result + "\n";
            writer.write(text);
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
