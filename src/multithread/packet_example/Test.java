package multithread.packet_example;

public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

//        stating the thread
        sender.start();
        receiver.start();
    }
}
