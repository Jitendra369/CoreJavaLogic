package basic;

public class Dog extends  Animal{
    String color="brown";
    Dog(){
        System.out.println("Default Dog class constructor ");
    }

    void getColor(){
        System.out.println("dog color : " +this.color);
        System.out.println("Animal Color : "+super.color);
    }
}
