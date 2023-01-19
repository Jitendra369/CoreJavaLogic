package multithread.packet_example;

public class Data {
    private String packet;
    private boolean transfer = true;
//    Data(){}

    public synchronized String receive(){
//        if flag is false , then wait
        System.out.println("going to receive packet, calling from Receiver.class");
        while (transfer){
//            if flag is false that because someone is using it, so we have to wait...
            try {
//                waiting resources
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        make the flag true so that another thread can use it/ this method
        System.out.println("receive packet "+ this.packet);
        String returnPacket = packet;
        transfer = true;
//        tell other thread that, i am done with my work
        notifyAll();
        return returnPacket;
    }

    public synchronized void sendPacket(String packet){
        System.out.println("getting data from sender "+ packet);
        while (!transfer){
            try {
                System.out.println("waiting for flag : sendPacket() ");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println("sending packet "+ packet);
            transfer = false;
            System.out.println("packet received : sendPacket() ");
            this.packet = packet;
            notifyAll();
        }
    }

}
