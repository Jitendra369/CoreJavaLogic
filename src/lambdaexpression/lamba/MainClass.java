package lambdaexpression.lamba;

public class MainClass {
    public static void main(String[] args) {


//        cat class implement the Printable interface
//        Cat cat = new Cat("jttu",23);
//        printingClass(cat);
//        printingClass(()->{
//            System.out.println("meao");
//        });

        Printable  printable =()-> System.out.println("bhao..");
        printingClass(printable);

        CustomPrintableClass custPrint =(message)-> System.out.println("kay baat "+ message);
        printCusMessage(custPrint);


    }

    static void printingClass(Printable pritableIntefaceClassObject){
        pritableIntefaceClassObject.print();
    }

    static void printCusMessage(CustomPrintableClass printThings){
        printThings.printMessge(" !!");
    }
}
