package multithread.basic;

public class UserThread extends  Thread{

    @Override
    public void run() {
//        super.run();
        System.out.println("User thread is running.....");
        System.out.println(Thread.currentThread().getName());
        System.out.println("checking for demon thread " + currentThread().isDaemon() );
    }
}
