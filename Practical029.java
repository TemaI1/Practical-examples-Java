// volatile

import java.util.Scanner;

public class Practical029 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true; // будет атомарно(одно и тоже значение) читаться и записываться, не будет помещена в кэш

    @Override
    public void run() {
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
