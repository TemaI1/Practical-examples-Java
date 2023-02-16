package JavaPractical;

import java.io.*;
import java.util.Scanner;
import JavaPractical.ListToys.*;

public class MayMethods {

    public static void allExistingToys(){
        boardGame boardGameVersion1 = new boardGame(1, "boardGame", 5.2f, "for schoolchildren", "wooden");
        designer designerVersion1 = new designer(2, "designer", 6.5f, "for school children", "plastic");
        doll dollVersion1 = new doll(3, "doll", 2.3f, "for preschool children", "plastic");
        robot robotVersion1 = new robot(4, "robot", 7.7f, "for schoolchildren", "metal");
        softToy softToyVersion1 = new softToy(5, "softToy", 1.3f, "for schoolchildren", "fabric and cotton wool");
        toyCar toyCarVersion1 = new toyCar(6, "toyCar", 3.2f, "for schoolchildren", "plastic");

        System.out.println("Список игрушек в наличии: ");
        System.out.println(boardGameVersion1.toString() + "\n");
        System.out.println(designerVersion1.toString() + "\n");
        System.out.println(dollVersion1.toString() + "\n");
        System.out.println(robotVersion1.toString() + "\n");
        System.out.println(softToyVersion1.toString() + "\n");
        System.out.println(toyCarVersion1.toString() + "\n");
    }

    public static void choiceToy(){
        System.out.print("Введите id интересующей игрушки(1-6): ");
        Scanner scan = new Scanner(System.in);
        String toy = scan.nextLine();

        while(true){
            if (toy.equals("1")) {
                System.out.println("Вы выбрали board game");
                break;
            } else if (toy.equals("2")){
                System.out.println("Вы выбрали designer");
                break;
            } else if (toy.equals("3")){
                System.out.println("Вы выбрали doll");
                break;
            } else if (toy.equals("4")){
                System.out.println("Вы выбрали robot");
                break;
            } else if (toy.equals("5")){
                System.out.println("Вы выбрали soft toy");
                break;
            } else if (toy.equals("6")){
                System.out.println("Вы выбрали toy car");
                break;
            } else {
                System.out.print("Такого значения не существует, повторите попытку: ");
                toy = scan.nextLine();
            }
        }
    }

    public static void guessNumber(){
        System.out.print("Для того что бы игрушка стала вашей, необходимо угадать число (1-3): ");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();

        int randomNumber = (int) (Math.random() * 3) + 1;

        if (userNumber == randomNumber) {
            System.out.println("Вы угадали, теперь игрушка ваша, поздравляю!!! \nПредставьтесь, я добавлю Вас в список победителей");

            System.out.print("Введите ваше имя: ");
            Scanner scan2 = new Scanner(System.in);
            String name = scan2.nextLine();
            System.out.print("Укажите ваш возраст: ");
            String age = scan2.nextLine();
            System.out.println("Зафиксировал ваши данные");
            scan2.close();

            try(FileWriter writer = new FileWriter("winners.txt", true)){
                String text = "name: " + name + ", age: " + age +"\n";
                writer.write(text);
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            } 
        } else {
            System.out.println("Вы проиграли, попробуйте в следующий раз!");
        }
    }

}
