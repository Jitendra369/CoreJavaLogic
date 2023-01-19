package multithread.basic;

public class Test {
    public static void main(String[] args) {
    MyThread myThread = new MyThread();
    MyThread_two myThread_two = new MyThread_two();
    Thread thread1 = new Thread(myThread);
    Thread thread2 = new Thread(myThread_two);
    thread1.start();
    thread2.start();
    }
}
