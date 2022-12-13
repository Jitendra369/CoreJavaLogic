package generic.classGenric;

import java.io.Serializable;

public class CommonAnimalPriter<T extends Animal> {
//    some restrictions of using generics
//if we have interface then also we have extends that interface
//    only one class
//    first class then interface
    T thingTOPrint;

    CommonAnimalPriter(T thingTOPrint){
        this.thingTOPrint = thingTOPrint;
    }

    public void print(){
        thingTOPrint.getAnimalVoice();
        System.out.println(thingTOPrint);
    }
}
