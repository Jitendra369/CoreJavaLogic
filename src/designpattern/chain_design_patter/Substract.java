package designpattern.chain_design_patter;

public class Substract implements Chain{

    //  store the next object in the chain
    private Chain newxtChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.newxtChain = nextChain;
    }

    @Override
    public void calculate(Numbers NumberRequest) {
        if (NumberRequest.getCalculationWanted()=="sub"){
            System.out.println(NumberRequest.getNumber1() +" "+ NumberRequest.getNumber2() +" = " + (NumberRequest.getNumber1() -  NumberRequest.getNumber2()));
        }else{
            System.out.println("no such operation present to perform operation");
        }
    }
}

