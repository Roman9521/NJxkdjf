package multithreading;

public class Example1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Example1 thread1 = new Example1();
        thread1.start();

        for (int i = 0; i > 0; i--) {
            System.out.println(i);
        }

        //        new MyThread1().start();
//        new MyThread2().start();
    }
}



class MyThread1 extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
