package multithread.basic;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Start...");
        Thread thread = Thread.currentThread();
        System.out.println("Thread name:  "+ thread.getName() +" ,id: "+ thread.getId()+" ,state : "+ thread.getState());
//        second thread
        UserThread userThread = new UserThread();
        userThread.start();
        System.out.println("End...");
    }
}
