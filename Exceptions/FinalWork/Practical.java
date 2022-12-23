package Exceptions.FinalWork;

import java.util.Scanner;

public class Practical {
    public static void main(String[] args) throws Exception {
        MayException except = new MayException();
        WorkingFile file = new WorkingFile();
        Scanner scan = new Scanner(System.in, "Cp866");

        System.out.println("Введите ФИО в формате: Alekseev Ivan Alexandrovich");
        String name = scan.nextLine();
        except.emptyString(name);
        except.longLine(name);
        file.writingFile("\n" + name);
        
        System.out.println("Введите дату рождения в формате: 01.01.2000");
        String age = scan.nextLine();
        except.emptyString(age);
        except.numberCharacters(age, 10);
        except.pointMissing(age);
        file.writingFile(age);

        System.out.println("Введите номер телефона РФ в формате: 89995559595");
        String number = scan.nextLine();
        except.emptyString(number);
        except.numberCharacters(number, 11);
        except.invalidFormat(number);
        file.writingFile(number);

        System.out.println("Укажите пол(f или m) в формате: m");
        String gender  = scan.nextLine();
        except.emptyString(gender);
        except.numberCharacters(gender, 1);
        except.incorrectCharacter(gender);
        file.writingFile(gender);

        scan.close();

        System.out.println("Ваша запись успешно создана");

    }
}
