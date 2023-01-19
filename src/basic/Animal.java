package basic;

public class Animal {
    String color ="white";
    String animalType;

    Animal(){
        System.out.println("default animal constructor class");
    }
    //constructor for animal class
    public Animal(String animalType) {
        this.animalType = animalType;
    }
}
