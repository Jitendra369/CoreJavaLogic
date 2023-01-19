package designpattern.callback;

//caller class will call the calle class , & wait for the task to complete
public class Calle {

    private CallBack callBack;

    public  Calle(CallBack callBack){
        this.callBack = callBack;
    }

//    this is where the task in executed, this kind of task are usually done
//    in a background tharead called asynch task

    public  void doAsynchTask(){
        System.out.println("Doing task.....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("I am done with task");
        callBack.notifyCaller();

    }


}
