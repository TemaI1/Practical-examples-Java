package MyBook;

import javax.swing.JOptionPane;

public class ShowDemo {
    public static void main(String[] args) {
        String title = JOptionPane.showInputDialog(null, "Имя для окна:", "Название окна", JOptionPane.WARNING_MESSAGE);
        String text = JOptionPane.showInputDialog(null, "Текст сообщения:", "Название окна", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
