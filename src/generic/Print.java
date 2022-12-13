package generic;

public class Print <T>{
    T thingToPrint;
//generic don't work with primitive type like int, float...
    public Print(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public  void print(){
        System.out.println(thingToPrint);
    }
}
