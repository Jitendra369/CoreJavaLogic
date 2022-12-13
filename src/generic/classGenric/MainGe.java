package generic.classGenric;

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
}
