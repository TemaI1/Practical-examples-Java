// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

import java.util.Scanner;
public class Practical004 {

    static void tower(int n,char first,char second,char third) {
        if(n == 1) {
        System.out.println(n + " from " + first + " to " + third);
        return;
        }
        tower(n - 1,first,third,second);
        System.out.println(n + " from " + first + " to " + third);
        tower(n - 1,second,first,third);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите колличество колец: ");
        int n = iScanner.nextInt();
        tower(n,'A','B','C');
        iScanner.close();
    }
}