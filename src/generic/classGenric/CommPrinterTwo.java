package generic.classGenric;

public class CommPrinterTwo<T extends Animal,V extends Animal> {
    //    some restrictions of using generics
//if we have interface then also we have extends that interface
//    only one class
//    first class then interface
    T thingTOPrint;
    V otherThingToPrint;

    public CommPrinterTwo(T thingTOPrint, V otherThingToPrint){
        this.thingTOPrint = thingTOPrint;
        this.otherThingToPrint = otherThingToPrint;
    }

    public void print(){
        Cat cat =(Cat) thingTOPrint;
        Dog dog = (Dog) otherThingToPrint;
        System.out.println("cat class :" + cat.getCatLeg() +" Dog Class "+ dog.getTotalLeg());
    }
}

