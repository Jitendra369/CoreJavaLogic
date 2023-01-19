package multithread.packet_example;

public class Receiver implements Runnable{

    private Data data;
    Receiver(Data data){
        this.data= data;
    }

    @Override
    public void run() {
        for (String receiveMessage= data.receive();!"End".equals(receiveMessage); receiveMessage= data.receive()){
//            System.out.println(receiveMessage);
            data.receive();
            try {
                //Thread.sleep() to mimic heavy server-side processing
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
