package javaCoursec;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class MainReentrantLock {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {

    }
    static class Thread1 extends Thread {
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " start working");
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " stop working");
            lock.unlock();
            System.out.println(getName() + " lock is released");
        }
    }
}
