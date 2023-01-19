package multithread.producer_consumer;

public class ConsumerThread extends  Thread{

    Company company;
    ConsumerThread(Company company){
        this.company = company;
    }

    @Override
    public void run() {
//        super.run();
        while (true){
            try {
                this.company.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
