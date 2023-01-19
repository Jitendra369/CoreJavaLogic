package designpattern.chain_design_patter;

public class Test {
    public static void main(String[] args) {
        Chain chainAdd = new AddNumber();
        Chain chainMul = new Multiply();
        Chain chainSub = new Substract();
        chainAdd.setNextChain(chainMul);
        chainMul.setNextChain(chainSub);

        Numbers numbers = new Numbers(25, 12, "mulll");
        chainAdd.calculate(numbers);
    }
}
