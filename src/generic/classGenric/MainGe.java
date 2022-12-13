package generic.classGenric;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainGe {
    public static void main(String[] args) {
        CommonAnimalPriter<Cat> catPrint = new CommonAnimalPriter<>(new Cat("four"));
        catPrint.print();

        CommonAnimalPriter<Dog> dogPrinter = new CommonAnimalPriter<>(new Dog("four"));
        dogPrinter.print();
        printMessage("hellow string", "String");
        printMessage(454,"double");
        printMessage(545.4545,"float");


//    CommonPrinter class with two generic value type
    CommPrinterTwo<Cat, Dog> catAndDogPrinter = new CommPrinterTwo<>(new Cat("two"), new Dog("8 leg"));
    catAndDogPrinter.print();

     ArrayList<String> list = (ArrayList<String>) printMessageWithSpecificReturnType("Cat", "Dog");
        System.out.println("Another print method");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }




//    Generic method , T any Type , right before the return type
    private static <T,V> void printMessage(T message, V other_mess){

        try {

//        String me = (String) message;
//        System.out.println(me);
        System.out.println(message + "  "+ other_mess);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static <T,V> List<T> printMessageWithSpecificReturnType(T message, V other_mess) {

        List<T> studentNames = new ArrayList<>();
        try {

//        String me = (String) message;
//        System.out.println(me);
//            studentNames = new ArrayList<>();
//            studentNames.add("one");
//            studentNames.add("two");
//            studentNames.add("three");
            System.out.println(message + "  " + other_mess);

        } catch (Exception e) {
            e.printStackTrace();
        }
//      return type 'T'
        return studentNames;
    }
}
