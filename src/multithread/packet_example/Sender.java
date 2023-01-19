package multithread.packet_example;

public class Sender implements Runnable {

    private Data data;

    Sender(Data data){
        this.data= data;
    }

    @Override
    public void run() {
        String[] packets ={
            "First Packet ",
                "second Packet ",
                "third Packet ",
                "fourth Packet ",
                "fifth Packet ",
                "End"
        };

//        sending packet
        for (String packet: packets) {
            System.out.println("send packet :"+ packet);
            data.sendPacket(packet);
            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
