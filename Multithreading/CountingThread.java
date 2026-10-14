package Multithreading;

public class CountingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count:" + i);
        }
    }

    public static void main(String[] args) {
        CountingThread t1 = new CountingThread();
        t1.start();
    }
}
