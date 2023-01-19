package multithread.producer_consumer;

public class Company {
    int item;  // non-share item at the same time, by below methods
    boolean flag = false;  // for inter process communication

//    produce item
//    synchronized make the item non-sharable
    synchronized public void produce_item(int item) throws InterruptedException {
        if (flag){
            wait();
        }
        this.item = item;
        System.out.println("produce item.. "+ this.item);
        flag = true;
        notify();
    }

//    consume item, which is generate by producerThread and set by produce_item() method
    synchronized public int consume_item() throws InterruptedException {
        if (!flag){
            wait();
        }
            System.out.println("Consume item " + this.item);
            flag = false;
            notify();
            return this.item;

    }
}
