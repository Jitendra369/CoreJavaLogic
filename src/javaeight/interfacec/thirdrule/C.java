package javaeight.interfacec.thirdrule;

public class C extends  A implements I,J{
    public static void main(String[] args) {
        C c = new C();
        c.show();
//        class A has more priority that both the interface I & J
    }


}
