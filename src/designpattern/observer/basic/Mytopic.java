package designpattern.observer.basic;

import java.util.ArrayList;
import java.util.List;

public class Mytopic implements Subject{

    private List<Observer> observerList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    Mytopic(){
        this.observerList = new ArrayList<>();
    }


    @Override
    public void register(java.util.Observer observer) {
        if (observer== null){
            synchronized (MUTEX){
//                if (observer.conta)
            }
        }
    }

    @Override
    public void unRegister(java.util.Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public Object getObject() {
        return null;
    }
}
