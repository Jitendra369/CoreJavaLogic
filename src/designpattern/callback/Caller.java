package designpattern.callback;

public class Caller implements CallBack{

    Calle calle = new Calle(this);

    @Override
    public void notifyCaller() {
        System.out.println("getting data from calller class");
        System.out.println("not i get the data");
    }

    public  void afterTaskDone(){
        System.out.println("getting data from calller class");
        System.out.println("not i get the data");
    }

    public void callAsynctaskOfCalle(){
        calle.doAsynchTask();
    }
}
