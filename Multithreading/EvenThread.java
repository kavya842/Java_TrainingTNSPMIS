package Multithreading;

public class EvenThread extends Thread {
    public void run(){
        for(int i=2;i<=10;i+=2){
            System.out.println("Count"+i);
        }
    }
public static void main(String[] args){
    EvenThread t2=new EvenThread();
    t2.start();
}
}
