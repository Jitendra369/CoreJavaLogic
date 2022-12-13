package generic;

public class TypePara {
    public static void main(String[] args) {
        Print<Integer> print = new Print<>(22);
        Print<Double> printFloat = new Print<>(22.12);
        print.print();
        printFloat.print();

    }
}
