// Выбрасывание исключений

package Exceptions;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) throws ScanerExceptions{
        System.out.println("Введите число меньше 10: ");
        Scanner scan = new Scanner(System.in);

        while(true){
            int num = Integer.parseInt(scan.nextLine());

            if(num >= 10){
                    throw new ScanerExceptions("Error");
            }
        }

    }
}
