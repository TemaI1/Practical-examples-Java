package MyBook;

import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Введите первое число: ", "Сalculator", JOptionPane.INFORMATION_MESSAGE);
        String number2 = JOptionPane.showInputDialog(null, "Введите второе число: ", "Сalculator", JOptionPane.INFORMATION_MESSAGE);
        String action = JOptionPane.showInputDialog(null, "Введите действие, + , - , * , / : ", "Сalculator", JOptionPane.INFORMATION_MESSAGE);

        int a = Integer.parseInt (number);
        int b = Integer.parseInt (number2);
        int result = 0;

        if(action.equals("+")){result = a + b;}
        if(action.equals("-")){result = a - b;}
        if(action.equals("*")){result = a * b;}
        if(action.equals("/")){result = a / b;}

        JOptionPane.showMessageDialog(null, a + " " + action +  " " + b + " = " + result, "Сalculator", JOptionPane.WARNING_MESSAGE);
    }
}
