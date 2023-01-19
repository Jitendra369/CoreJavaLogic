package designpattern.observer.basic;



public interface Subject {

    //methods to register and unregister observers
    public void register(java.util.Observer observer);
    public void unRegister(java.util.Observer observer);

    //method to notify observers of change
    public void notifyObserver();

    public Object getObject();
}
