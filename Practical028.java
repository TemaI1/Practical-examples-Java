// multithreading(многопоточность)

public class Practical028 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("main thread");

        Thread.sleep(3000);
        System.out.println("I am go sleeping...");
        Thread.sleep(3000);
        System.out.println("I am awake!");

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class MyThread extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("My thread: " + i);
        }
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My thread: " + i);
        }
    }
}
