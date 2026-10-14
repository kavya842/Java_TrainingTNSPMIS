//!1. What is multithreading?
// Multithreading means executing multiple threads within a single program.
// A thread is a small unit of execution inside a program.
// Real-life example: Imagine you're using your laptop to:
// - Download a file.
// - Listen to music.
// - Type a document.

//!2. Two ways to create a thread in Java
// 1. Extending the Thread class.
// 2. Implementing the Runnable interface.


package Multithreading;

public class ThreadDemo1 extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadDemo1 t = new ThreadDemo1();
        t.start();
    }
}
