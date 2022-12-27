package lambdaexpression.masterlambda;

public class MainClass {
    public static void main(String[] args) {
        MyClassInterface myClassInterface = new MyInterImple();
        myClassInterface.print();

//        anno. class for implement the interface
//        we need not create another class that implemnt the interface, this is anno.class
        MyClassInterface classInterface = new MyClassInterface() {
            @Override
            public void print() {
                System.out.println("this is inner class");
            }
        };
        classInterface.print();

//        same result using lambda expression
        MyClassInterface inter = ()-> System.out.println("print using lambda expression");

        inter.print();

//        interface with paramaters
//        AddingInterface addInterface = (int x, int y)->{
////            method implementation
//            return x + y ;
//        };

//        modified version
        AddingInterface addInterface = (x, y) ->  x + y;
        System.out.println("Adding using  lambda "+addInterface.add(3, 6));

        StringLength length = (str)-> str.length();
        System.out.println("length of the string "+length.getLength("jitendra kadu"));





    }
}
