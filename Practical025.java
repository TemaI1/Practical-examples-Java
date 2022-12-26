// вложенные классы

public class Practical025 {
    public static void main(String[] args) {
        Electrocar car1 = new Electrocar(1);
        Electrocar.Battery battery1 = new Electrocar.Battery();
        car1.start();
        battery1.charge();
    }
}

class Electrocar {
    private int id;

    // вложенный нестатический класс 
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging ...");
        }
    }
    
    public Electrocar(int id){
        this.id = id;
    }

    public void start(){
        Motor motor1 = new Motor();
        motor1.startMotor();
        System.out.println("Electrocar " + id + " is starting...");

        // вложенный класс в методе
        final int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

    }
}
