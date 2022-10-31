import java.util.ArrayList;

public class Practical008 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();

        list.add("Hello"); // Добавляет новый элемент в конец списка
        list.add(0, "Amigo"); // Добавляет элемент element в позицию index
        secondList.addAll(0, list); // Добавление всех элементов в список начиная с индекса index
        ArrayList<String> copyOfSecondList = (ArrayList<String>) secondList.clone(); // Возвращает объект-копию массива
        copyOfSecondList.clear(); // Удаление всех элементов из списка
        System.out.println(secondList.contains("Hello")); // Проверка наличие объекта в списке, возвращает boolean-значение

        // Обработать в цикле ArrayList можно стандартными способами, цикл for
        for(int i = 0; i < secondList.size(); i++) {
            System.out.println(secondList.get(i));
        }
        
    }
}