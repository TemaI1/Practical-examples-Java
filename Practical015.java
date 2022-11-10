// get and set

public class Practical015 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Artem");
        person1.setAge(24);
        System.out.println("Выводим значения в main: " + person1.getName());
        System.out.println("Выводим значения в main: " + person1.getAge());
    }
}

class Person{
    private String login;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Вы ввели пустое значение");
        }else{
            login = userName;
        }
    }
    public String getName(){
        return login;
    }

    public void setAge(int userAge){
        if(userAge < 0){
            System.out.println("Не верное значение");
        }else{

        }
        age = userAge;
    }
    public int getAge(){
        return age;
    }
}